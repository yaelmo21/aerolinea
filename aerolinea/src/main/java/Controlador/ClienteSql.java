package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import databse.AwsConnect;

public class ClienteSql {
	
	private String nombre;
	private int edad;
	private double telefono;
	private String mail;
	private AwsConnect datbase;
	
	public ClienteSql(String nombre, int edad, double telefono, String mail) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.mail = mail;
	}
	
	public boolean AltaCliente() {
		
		boolean resultado = false;
		this.datbase = new AwsConnect();
		try {
			this.datbase.connectDatabase().createStatement().execute("INSERT INTO CLIENTE(NUMERO,NOMBRE,EDAD,TELEFONO,MAIL) VALUES (NULL,'"+this.nombre+"',"+this.edad+","+this.telefono+
					",'"+this.mail+"' )");
			resultado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultado;
		
		
	}
	
	public int getNumCliente() {
		int resultado = 0;
		this.datbase = new AwsConnect();
		try {
			ResultSet rs = this.datbase.connectDatabase().createStatement().executeQuery("SELECT NUMERO FROM CLIENTE WHERE MAIL='"+this.mail+"'");
			if(rs.next()) {
				resultado = rs.getInt("NUMERO");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return resultado;
	}
	
	

}
