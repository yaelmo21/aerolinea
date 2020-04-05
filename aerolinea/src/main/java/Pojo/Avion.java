package Pojo;

public class Avion {
	
	private int id;
	private String piloto;
	private String coPiloto;
	
	
	public Avion(){
		
	}
	
	public Avion(int id, String piloto, String coPiloto) {
		
		this.id = id;
		this.piloto = piloto;
		this.coPiloto = coPiloto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getCoPiloto() {
		return coPiloto;
	}

	public void setCoPiloto(String coPiloto) {
		this.coPiloto = coPiloto;
	}

	@Override
	public String toString() {
		return "Avion [id=" + id + ", piloto=" + piloto + ", coPiloto=" + coPiloto + "]";
	}
	
	
	
	
}
