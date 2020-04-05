package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Pojo.Asiento;
import databse.AwsConnect;

public class AsientosSql {

	private AwsConnect datbase;
	private int idVuelo;
	
	public AsientosSql(int idVuelo) {
		this.idVuelo = idVuelo;
	}
	
	public AsientosSql(){
		
	}
	
	public ArrayList<Asiento> getAsientos(){
		
		ArrayList<Asiento> lista = new ArrayList<Asiento>();
		
		VuelosSql vuelos = new VuelosSql();
		
		this.datbase = new AwsConnect();
		
		int idAvion = vuelos.getIDAvion(this.idVuelo);
		
		try {
			ResultSet rs = this.datbase.connectDatabase().createStatement().executeQuery("SELECT * FROM ASIENTO WHERE IDAVION="+idAvion);
			while(rs.next()) {
				lista.add(new Asiento(rs.getString("ID"),rs.getInt("IDAVION"),rs.getBoolean("ESTADO")));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return lista;
		
	}
	
	public boolean adquirirAsiento(String idAsiento) {
		boolean resultado = false;
		this.datbase = new AwsConnect();
		try {
			this.datbase.connectDatabase().createStatement().execute("UPDATE ASIENTO SET ESTADO=FALSE WHERE ID='"+idAsiento+"'");
			resultado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultado;
	}
	
}
