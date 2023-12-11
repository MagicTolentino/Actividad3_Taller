package datos;
import java.sql.Connection;
import java.sql.DriverManager;

public class MostrarDatos {
	Connection connection;


	public MostrarDatos() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Reservas Events","root", "Tolentino1");
		}catch (Exception e) {
			System.err.println("Error"+e);
		}
	}
	
	public Connection getConnection() {
	return connection;
	}
}