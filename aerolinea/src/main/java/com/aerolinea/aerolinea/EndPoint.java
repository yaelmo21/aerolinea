package com.aerolinea.aerolinea;

import java.awt.List;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.xml.datatype.XMLGregorianCalendar;

import org.example.aerolinea.AsientosRequest;
import org.example.aerolinea.AsientosResponse;
import org.example.aerolinea.CancelCompraRequest;
import org.example.aerolinea.CancelCompraResponse;
import org.example.aerolinea.CompraRequest;
import org.example.aerolinea.CompraResponse;
import org.example.aerolinea.ConsultarCompraRequest;
import org.example.aerolinea.ConsultarCompraResponse;
import org.example.aerolinea.VuelosRequest;
import org.example.aerolinea.VuelosResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import Controlador.AsientosSql;
import Controlador.CompraSql;
import Controlador.VuelosSql;
import Pojo.Asiento;
import Pojo.Compra;
import Pojo.Vuelo;
import databse.AwsConnect;

@Endpoint
public class EndPoint {
	
	@PayloadRoot(namespace="http://www.example.org/aerolinea", localPart="VuelosRequest")
	@ResponsePayload
	
	public VuelosResponse getVuelos(@RequestPayload VuelosRequest peticion) {
		VuelosResponse respuesta = new VuelosResponse();
		VuelosSql peticionSql = new VuelosSql(peticion.getOrigin(),peticion.getDestination(),peticion.getDate());
		ArrayList<Vuelo> lista = peticionSql.consultVuelos();
		
		if(lista.size() !=0) {
			respuesta.setIdVuelo(lista.get(0).getNumero());
			respuesta.setOrigin(lista.get(0).getOrigen());
			respuesta.setDestination(lista.get(0).getDestino());
			respuesta.setDate(String.valueOf(lista.get(0).getFecha()));
			respuesta.setPrice(lista.get(0).getPrecio());
			respuesta.setTime(String.valueOf(lista.get(0).getHora()));
		}else {
			respuesta.setIdVuelo(0);
			respuesta.setOrigin("");
			respuesta.setDestination("");
			respuesta.setDate("");
			respuesta.setPrice(0);
			respuesta.setTime("");
			respuesta.setAlert("No se han encontrado vuelos");
			
			
		}
		
		
		
		
		return respuesta;
		
	}
	
	
	@PayloadRoot(namespace="http://www.example.org/aerolinea", localPart="AsientosRequest")
	@ResponsePayload
	
	public AsientosResponse getAsientos(@RequestPayload AsientosRequest peticion) {
		
		AsientosResponse respuesta = new AsientosResponse();
		AsientosSql asientos = new AsientosSql(peticion.getIdVuelo());
		ArrayList<Asiento> asientosVuelo = asientos.getAsientos();
		ArrayList<AsientosResponse.Asiento> asientosRespuesta = new ArrayList<AsientosResponse.Asiento>();
		
		if(asientosVuelo.size() != 0) {
			for (Asiento asiento:asientosVuelo) {
				AsientosResponse.Asiento temp = new AsientosResponse.Asiento();
				temp.setId(asiento.getId());
				if(asiento.isEstado()) {
					temp.setStatus("Disponible");
				}else {
					temp.setStatus("Ocupado");
				}
				
				asientosRespuesta.add(temp);
				respuesta.setAsiento(asientosRespuesta);
			}
		}else {
			respuesta.setAlert("No se han encontrado asientos");
			respuesta.setAsiento(asientosRespuesta);
		}
		
		
		
		return respuesta;
		
	}
	
	
	@PayloadRoot(namespace="http://www.example.org/aerolinea", localPart="CompraRequest")
	@ResponsePayload
	public CompraResponse getCompra(@RequestPayload CompraRequest peticion) {
		CompraResponse respuesta = new CompraResponse();
		CompraSql buy = new CompraSql(peticion.getIdVuelo(),peticion.getIdAsiento(),peticion.getNameClient(),peticion.getEdadClient(),peticion.getPhoneClient(),peticion.getEmailClient());
		if(buy.realizarCompra()) {
			
			VuelosSql sqlVul = new VuelosSql();
			Vuelo vuel = sqlVul.getVuelo(peticion.getIdVuelo());
			
			if(vuel != null) {
				respuesta.setStatus(true);
				respuesta.setOrigin(vuel.getOrigen());
				respuesta.setDestination(vuel.getDestino());
				respuesta.setDate(String.valueOf(vuel.getFecha()));
				respuesta.setTime(String.valueOf(vuel.getHora()));
				respuesta.setNoTicket(buy.getNoTicket());
				respuesta.setNoVuelo(peticion.getIdVuelo());
				respuesta.setAlert("");
				
				}	
			
			
			
			
		}else {
			respuesta.setStatus(false);
			respuesta.setOrigin("");
			respuesta.setDestination("");
			respuesta.setDate("");
			respuesta.setNoTicket(0);
			respuesta.setNoVuelo(0);
			respuesta.setAlert("No  es posible realizar la compra");
		}
			
		
		return respuesta;
	}


	@PayloadRoot(namespace="http://www.example.org/aerolinea", localPart="CancelCompraRequest")
	@ResponsePayload
	
	public CancelCompraResponse getCancel(@RequestPayload  CancelCompraRequest peticion) {
		
		CancelCompraResponse respuesta = new CancelCompraResponse();
		CompraSql buy = new CompraSql(peticion.getNoTicket());
		if(buy.cancelCompra()) {
			respuesta.setStatus(true);
			respuesta.setMessage("Su compra ha sido cancelada");
			
		}else {
			respuesta.setStatus(false);
			respuesta.setMessage("Error: Su compra NO ha sido cancelada");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(namespace="http://www.example.org/aerolinea", localPart="ConsultarCompraRequest")
	@ResponsePayload
	
	public ConsultarCompraResponse getCompraConsulta(@RequestPayload ConsultarCompraRequest peticion) {
		ConsultarCompraResponse respuesta = new ConsultarCompraResponse();
		CompraSql buySql = new CompraSql(peticion.getNoTicket());
		Compra buy = buySql.getCompra();
		VuelosSql vuel = new VuelosSql();
		if(buy!=null) {
			Vuelo v = vuel.getVuelo(buy.getNumeroVuelo());
			respuesta.setAlert("");
			respuesta.setStatus(buy.isEstatus());
			respuesta.setOrigin(v.getOrigen());
			respuesta.setDestination(v.getDestino());
			respuesta.setDate(String.valueOf(v.getFecha()));
			respuesta.setTime(String.valueOf(v.getHora()));
			respuesta.setNoTicket(peticion.getNoTicket());
			respuesta.setNoVuelo(v.getNumero());
			
		}else {
			respuesta.setAlert("No se ha encontrado una ompra con ese número de ticket");
			respuesta.setOrigin("");
			respuesta.setDestination("");
			respuesta.setDate("");
			respuesta.setTime("");
			respuesta.setNoTicket(0);
			respuesta.setNoVuelo(0);
		}
	
		
		
		return respuesta;
	}

}