package dao;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.ClientEndpoint;

import model.Order;
import com.mysql.cj.xdevapi.PreparableStatement;
import db.MySqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Customer;

public class OrderDAO implements CRUD {

	private static Connection con = MySqlConnection.createConnection();
	private static String sql; 
	
	
	public static void create(Order order) {
		
		sql="INSERT INTO orders VALUES (null, ?, ?, ?, ?)";
		
		try {
				
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setDouble(1, order.getPurch_amt());
			ps.setString(2, order.getOrd_date());
			ps.setInt(3, order.getCustomer_id());
			ps.setInt(4, order.getSalesman_id());
			
			ps.executeUpdate();
			
			System.out.println("--correct INSERT to DATABASE");
			
		}catch (SQLException e) {
			
			System.out.println("--incorrect INSERT to DATABASE" + e.getMessage());
			
		}
		
	}	
	
	public static void delete(int customerId) {
		
	}
	
	public static List<Order> find(String pesquisa){
		
		return null;
			
	}
	
	public static Order findByPk(int OrderId){
		
		return null;
	}
	
	public static void update(Order order) {
		
		
	}
	
	
}
