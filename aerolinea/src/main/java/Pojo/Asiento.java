package Pojo;

public class Asiento {
	
	private String id;
	private int idAvion;
	private boolean estado;
	
	public Asiento(String id, int idAvion, boolean estado) {
		this.id = id;
		this.idAvion = idAvion;
		this.estado = estado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Asiento [id=" + id + ", idAvion=" + idAvion + ", estado=" + estado + "]";
	}
	
	
	
	
	
}
