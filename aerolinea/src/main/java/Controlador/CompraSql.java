package Controlador;

import java.sql.ResultSet;
import java.sql.SQLException;

import Pojo.Compra;
import databse.AwsConnect;

public class CompraSql {
	
	private int idVuelo;
	private String nombre;
	private int edad;
	private double telefono;
	private String mail;
	private String idAsiento;
	private AwsConnect datbase;
	private int noTicket;
	
	public CompraSql(int noTicket) {
		this.noTicket = noTicket;
	}
	
	public CompraSql(int idVuelo,String idAsiento, String nombre, int edad, double telefono, String mail) {
		this.idVuelo = idVuelo;
		this.idAsiento = idAsiento;
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.mail = mail;
	}
	
	public boolean realizarCompra() {
		boolean resultado = false;
		this.datbase = new AwsConnect();
		AsientosSql asiento = new AsientosSql();
		ClienteSql cliente = new ClienteSql(this.nombre,this.edad,this.telefono,this.mail);
		boolean resultAsiento = asiento.adquirirAsiento(this.idAsiento);
		
		if(resultAsiento) {
			boolean resultadoCliente = cliente.AltaCliente();
			if(resultadoCliente) {
				
				int numeroCliente = cliente.getNumCliente();
				String sql = "INSERT INTO COMPRA(NUMERO_TICKET,NUMERO_CLIENTE,NUMERO_VUELO,ESTATUS,ID_ASIENTO) VALUES(NULL,"+numeroCliente+","+this.idVuelo+",true,'"+this.idAsiento+"')";
				try {
					this.datbase.connectDatabase().createStatement().execute(sql);
					resultado = true;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		return resultado;
	}
	
	public int getNoTicket() {
		
		int ticket = 0;
		ClienteSql cliente = new ClienteSql(this.nombre,this.edad,this.telefono,this.mail);
		int numeroCliente = cliente.getNumCliente();
		this.datbase = new AwsConnect();
		String sql = "SELECT NUMERO_TICKET FROM COMPRA WHERE NUMERO_CLIENTE="+numeroCliente+" AND NUMERO_VUELO="+this.idVuelo;
		
		try {
			ResultSet rs = this.datbase.connectDatabase().createStatement().executeQuery(sql);
			
			if(rs.next()) {
				ticket = rs.getInt("NUMERO_TICKET");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return ticket;
	}
	
	public boolean cancelCompra() {
		boolean resultado = false;
		String sql = "SELECT NUMERO_TICKET FROM COMPRA WHERE NUMERO_TICKET="+this.noTicket;
		
		this.datbase = new AwsConnect();
		
		try {
			ResultSet rs = this.datbase.connectDatabase().createStatement().executeQuery(sql);
			
			if(rs.next()) {
				sql = "UPDATE COMPRA SET ESTATUS=FALSE WHERE NUMERO_TICKET="+this.noTicket;
				this.datbase.connectDatabase().createStatement().execute(sql);
				resultado = true;
			}

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultado;
		
		
	}
	
	
	public Compra getCompra() {
		Compra buy = null;
		this.datbase = new AwsConnect();
		try {
			ResultSet rs = this.datbase.connectDatabase().createStatement().executeQuery("SELECT * FROM COMPRA WHERE NUMERO_TICKET="+this.noTicket);
			if(rs.next()) {
				buy = new Compra(rs.getInt("NUMERO_TICKET"),rs.getInt("NUMERO_CLIENTE"),rs.getInt("NUMERO_VUELO"),rs.getBoolean("ESTATUS"),rs.getString("ID_ASIENTO"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return buy;
	}
	
	
	

}
