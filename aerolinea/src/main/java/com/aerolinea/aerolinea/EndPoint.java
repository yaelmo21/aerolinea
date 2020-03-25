package com.aerolinea.aerolinea;

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
}