package com.aerolinea.aerolinea;

import org.example.aerolinea.AsientosRequest;
import org.example.aerolinea.AsientosResponse;
import org.example.aerolinea.CancelCompraRequest;
import org.example.aerolinea.CancelCompraResponse;
import org.example.aerolinea.CompraRequest;
import org.example.aerolinea.CompraResponse;
import org.example.aerolinea.VuelosRequest;
import org.example.aerolinea.VuelosResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class EndPoint {
	
	@PayloadRoot(namespace="http://www.example.org/aerolinea", localPart="VuelosRequest")
	@ResponsePayload
	
	public VuelosResponse getVuelos(@RequestPayload VuelosRequest peticion) {
		VuelosResponse respuesta = new VuelosResponse();
		respuesta.setIdVuelo(1245);
		respuesta.setOrigin(peticion.getOrigin());
		respuesta.setDestination(peticion.getDestination());
		respuesta.setDate(peticion.getDate());
		respuesta.setPrice(Float.parseFloat("500.10"));
		respuesta.setTime("15:00");
		
		
		return respuesta;
		
	}
	
	
	@PayloadRoot(namespace="http://www.example.org/aerolinea", localPart="AsientosRequest")
	@ResponsePayload
	public AsientosResponse getAsientos(@RequestPayload AsientosRequest peticion) {
		
		AsientosResponse respuesta = new AsientosResponse();
		respuesta.setIdAsiento("A19");
		respuesta.setAsientosDisponibles(1);
		
		return respuesta;
		
	}
	
	
	@PayloadRoot(namespace="http://www.example.org/aerolinea", localPart="CompraRequest")
	@ResponsePayload
	public CompraResponse getCompra(@RequestPayload CompraRequest peticion) {
		CompraResponse respuesta = new CompraResponse();
			respuesta.setStatus(true);
			respuesta.setOrigin("México City");
			respuesta.setDestination("Monterrey Nuevo León");
			respuesta.setDate("2020-03-25");
			respuesta.setNoTicket(37478);
		
		return respuesta;
	}


	@PayloadRoot(namespace="http://www.example.org/aerolinea", localPart="CancelCompraRequest")
	@ResponsePayload
	
	public CancelCompraResponse getCancel(@RequestPayload  CancelCompraRequest peticion) {
		
		CancelCompraResponse respuesta = new CancelCompraResponse();
		respuesta.setStatus(true);
		respuesta.setMessage("Su compra ha sido cancelada");
		return respuesta;
	}
	
	

}