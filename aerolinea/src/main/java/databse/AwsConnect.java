package databse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class AwsConnect {
	
	private Connection conexion = null;
	
	private String driver = "com.mysql.jdbc.Driver";
	private String database =  "aerolinea";
	private String hostname = "3.15.219.220";
	private String port= "3306";
	private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"?useTimezone=true&serverTimezone=UTC";
	private String username= "aerolinea";
	private String password="gygkaM-hixtiw-bydru6";
	
	
	public Connection connectDatabase() {
		
		try {
			this.conexion = DriverManager.getConnection(this.url,this.username,this.password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.conexion;
		
	}
	
	
}