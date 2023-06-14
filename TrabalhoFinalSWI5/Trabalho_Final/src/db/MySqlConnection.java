package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class MySqlConnection {

	
	private static final String url = "jdbc:mysql://localhost:3306/java_crud";
	private static final String user = "root";
	private static final String password = "";
	
	public static Connection createConnection() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver ENCONTRADO");
			
		}catch (ClassNotFoundException e) {
			System.out.println("Driver NOT FOUND." + e.getMessage());
		}
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to DATABASE");
			return connection;
			
		}catch (SQLException e) {
			System.out.println("NOT Connected to DB." + e.getMessage());
			return null;
		}

		
	}
	
	
	
}
