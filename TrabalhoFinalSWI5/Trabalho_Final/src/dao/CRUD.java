package dao;
import java.util.List;
import model.Customer;


public interface CRUD {
	
	
	public static void create(Customer customer) {}	
	public static void delete(int customerId) {};	
	public static List<Customer> find(String pesquisa){return null;}
	public static Customer findByPk(int customerId){return null;}
	public static void update(Customer customer) {}
	

}
