package dao;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.ClientEndpoint;
import com.mysql.cj.xdevapi.PreparableStatement;
import db.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Customer;
import model.SalesMan;

public class SalesManDAO implements CRUD {

	private static Connection con = MySqlConnection.createConnection();
	private static String sql; 
	
	
	public static void create(SalesMan salesman) {
		
		sql="INSERT INTO salesman VALUES (null, ?, ?, ?)";
		
		try {
				
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, salesman.getName());
			ps.setString(2, salesman.getCity());
			ps.setDouble(3, salesman.getComission());
			
			ps.executeUpdate();
			
			System.out.println("--correct INSERT to DATABASE");
			
		}catch (SQLException e) {
			
			System.out.println("--incorrect INSERT to DATABASE" + e.getMessage());
			
		}
		
	}	
	
	public static void delete(int salesId) {
		
	}
	
	public static List<SalesMan> find(String pesquisa){
		return null;
			
	}
	
	public static SalesMan findByPk(int salesId){
		
		return null;
	}
	
	public static void update(SalesMan salesman) {
		
		
	}
	
	
}
