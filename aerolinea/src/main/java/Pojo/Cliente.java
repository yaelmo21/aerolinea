package Pojo;

public class Cliente {
	
	private int numero;
	private String nombre;
	private int edad;
	private double telefono;
	private String mail;
	
	
	public Cliente() {
		
	}
	
	public Cliente(int numero, String nombre, int edad, double telefono, String mail) {
		this.numero = numero;
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.mail = mail;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getTelefono() {
		return telefono;
	}
	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	

	@Override
	public String toString() {
		return "Cliente [numero=" + numero + ", nombre=" + nombre + ", edad=" + edad + ", telefono=" + telefono
				+ ", mail=" + mail + "]";
	}

}
