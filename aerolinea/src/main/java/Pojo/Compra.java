package Pojo;

public class Compra {

	private int numeroTicket;
	private int numeroCliente;
	private int numeroVuelo;
	private boolean estatus;
	private String idAsiento;
	
	public Compra() {
		// TODO Auto-generated constructor stub
	}
		

	public Compra(int numeroTicket, int numeroCliente, int numeroVuelo, boolean estatus,String idAsiento) {
		this.numeroTicket = numeroTicket;
		this.numeroCliente = numeroCliente;
		this.numeroVuelo = numeroVuelo;
		this.estatus = estatus;
		this.idAsiento = idAsiento;
	}



	public int getNumeroTicket() {
		return numeroTicket;
	}



	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}



	public int getNumeroCliente() {
		return numeroCliente;
	}



	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}



	public int getNumeroVuelo() {
		return numeroVuelo;
	}



	public void setNumeroVuelo(int numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}



	public boolean isEstatus() {
		return estatus;
	}



	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	



	public String getIdAsiento() {
		return idAsiento;
	}


	public void setIdAsiento(String idAsiento) {
		this.idAsiento = idAsiento;
	}


	@Override
	public String toString() {
		return "Compra [numeroTicket=" + numeroTicket + ", numeroCliente=" + numeroCliente + ", numeroVuelo="
				+ numeroVuelo + ", estatus=" + estatus + "]";
	}
	
	
}
