package Pojo;

import java.sql.Date;
import java.sql.Time;

public class Vuelo {
	
	private int numero;
	private String origen;
	private String destino;
	private float precio;
	private Date fecha;
	private Time hora;
	private int IdAvion;
	
	
	public Vuelo() {
		
	}
	
	public Vuelo(int numero, String origen, String destino, float precio, Date fecha, Time hora, int idAvion) {
		this.numero = numero;
		this.origen = origen;
		this.destino = destino;
		this.precio = precio;
		this.fecha = fecha;
		this.hora = hora;
		this.IdAvion = idAvion;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public int getIdAvion() {
		return IdAvion;
	}
	public void setIdAvion(int idAvion) {
		IdAvion = idAvion;
	}
	@Override
	public String toString() {
		return "Vuelo [numero=" + numero + ", origen=" + origen + ", destino=" + destino + ", precio=" + precio
				+ ", fecha=" + fecha + ", hora=" + hora + ", IdAvion=" + IdAvion + "]";
	}
	
	
	
	
	
}
