package Controlador;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import com.sun.el.parser.ParseException;

import Pojo.Vuelo;
import databse.AwsConnect;

public class VuelosSql {
	
	private String origen;
	private String destino;
	private Date fecha;
	private AwsConnect datbase;
	
	public VuelosSql() {
		
	}
	
	public VuelosSql(String origen, String destino, String fecha) {
		this.origen = origen;
		this.destino = destino;
		this.fecha = Date.valueOf(fecha);
	}
	

	
	public ArrayList<Vuelo> consultVuelos() {
		
		
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>(); 
		ArrayList<Vuelo> vuelosAceptados = new ArrayList<Vuelo>(); 
		
		this.datbase = new AwsConnect();
		
		try {
			ResultSet rs = this.datbase.connectDatabase().createStatement().executeQuery("SELECT * FROM VUELO WHERE FECHA='"+this.fecha.toString()+"'");
			while(rs.next()) {
				vuelos.add(new Vuelo(rs.getInt("NUMERO"),rs.getString("ORIGEN"),rs.getString("DESTINO"),rs.getFloat("PRECIO"),
						rs.getDate("FECHA"),rs.getTime("HORA"),rs.getInt("IDAVION")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Vuelo v:vuelos) {
			String auxOrigen = v.getOrigen();
			String auxDestino = v.getDestino();
			if((auxOrigen.indexOf(this.origen)!= -1)&&(auxDestino.indexOf(this.destino)!= -1)){
				
				
				vuelosAceptados.add(new Vuelo(v.getNumero(),v.getOrigen(),v.getDestino(),v.getPrecio(),v.getFecha(),v.getHora(),v.getIdAvion()));
			}
		}
		
		
		return vuelosAceptados;
		
	}
	
	
	public int getIDAvion(int idVuelo) {
		int valor = 0;
		this.datbase = new AwsConnect();
		try {
			ResultSet rs = this.datbase.connectDatabase().createStatement().executeQuery("SELECT IDAVION FROM VUELO WHERE NUMERO="+idVuelo);
			if(rs.next()) {
				valor = rs.getInt("IDAVION");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return valor;
	}
	
	public Vuelo getVuelo(int id) {
		Vuelo vuel = null;
		this.datbase = new AwsConnect();
		try {
			ResultSet rs = this.datbase.connectDatabase().createStatement().executeQuery("SELECT * FROM VUELO WHERE NUMERO="+id);
			vuel =  new Vuelo();
			if(rs.next()) {
				vuel.setDestino(rs.getString("DESTINO"));
				vuel.setOrigen(rs.getString("ORIGEN"));
				vuel.setFecha(rs.getDate("FECHA"));
				vuel.setHora(rs.getTime("HORA"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return vuel;
		
		
	}
	
	
	

}
