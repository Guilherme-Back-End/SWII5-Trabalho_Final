package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.MySqlConnection;
import model.Customer;
import model.Customer;

public class CustomerDAO implements CRUD {

	private static Connection con = MySqlConnection.createConnection();
	private static String sql; 
	
	
	public static void create(Customer customer) {
		
		sql="INSERT INTO customer VALUES (null, ?, ?, ?, ?)";
		
		try {
				
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, customer.getName());
			ps.setString(2, customer.getCity());
			ps.setString(3, customer.getGrade());
			ps.setInt(4, customer.getSalesman());
			
			ps.executeUpdate();
			
			System.out.println("--correct INSERT to DATABASE");
			
		}catch (SQLException e) {
			
			System.out.println("--incorrect INSERT to DATABASE" + e.getMessage());
			
		}
		
	}	
	
	public static void delete(int customerId) {
		
		sql = "DELETE from customer WHERE customer_id = ?";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, customerId);
			ps.executeUpdate();
			
			System.out.println("---Correct DELETE on cliente");
			
			
		}catch (SQLException e) {
			
			System.out.println("---Incorrect DELETE on cliente" + e.getMessage());
			
		}
		
	}
	
	public static List<Customer> find(String pesquisa){
		
		
		sql = String.format("SELECT * from customer WHERE cust_name like '%s%%' OR customer_id LIKE '%s%%' ", pesquisa, pesquisa);
		List<Customer> customers = new ArrayList<Customer>();
		
		try {
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			
			while(resultSet.next()) {
				Customer customer = new Customer();
				customer.setId(resultSet.getInt("customer_id"));
				customer.setName(resultSet.getString("cust_name"));
				customer.setCity(resultSet.getString("city"));
				customer.setGrade(resultSet.getString("grade"));
				customer.setSalesman(resultSet.getInt("salesman_id"));
				
				customers.add(customer);				
				
			}
			
			System.out.println("---- Correct find customers");
			return customers;
				
			
		}catch (SQLException e) {
			
			System.out.println("---- Incorrect find customers" + e.getMessage());
			return null;
			
		}
			
	}
	
	public static Customer findByPk(int customerId){
		
		sql = String.format("SELECT * from customer WHERE customer_id = %d", customerId);
		
		try {
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Customer customer = new Customer();
			
			
			while(resultSet.next()) {
				
				
				customer.setId(resultSet.getInt("customer_id"));
				customer.setName(resultSet.getString("cust_name"));
				customer.setCity(resultSet.getString("city"));
				customer.setGrade(resultSet.getString("grade"));
				customer.setSalesman(resultSet.getInt("salesman_id"));			
			}
			
			System.out.println("---- Correct Find By Pk customers");
			return customer;
			
			}catch (SQLException e) {
				
				System.out.println("---Incorrect Find By Pk customers" + e.getMessage());
				return null;
			}
			}
	
	public static void update(Customer customer) {
		
	sql="UPDATE customer SET cust_name=?,  city=?, grade=?, salesman_id=? WHERE customer_id=?";
		
		try {
				
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, customer.getName());
			ps.setString(2, customer.getCity());
			ps.setString(3, customer.getGrade());
			ps.setInt(4, customer.getSalesman());
			ps.setInt(5, customer.getId());
			
			ps.executeUpdate();
			
			System.out.println("--correct Update on DATABASE");
			
		}catch (SQLException e) {
			
			System.out.println("--incorrect Update on DATABASE" + e.getMessage());
			
		}
		
		
	}
	
	
}
