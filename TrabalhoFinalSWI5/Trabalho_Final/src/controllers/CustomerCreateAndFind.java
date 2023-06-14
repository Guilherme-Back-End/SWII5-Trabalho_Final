package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import jdk.dynalink.linker.ConversionComparator;
import model.Customer;


@WebServlet("/CreateAndFind")
public class CustomerCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CustomerCreateAndFind() {
        super();
  
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pesquisa = request.getParameter("pesquisa");
		
		if(pesquisa==null) {
			pesquisa="";			
		}
		
		List<Customer> customers = CustomerDAO.find(pesquisa);
		
		request.setAttribute("customers", customers);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaCustomers.jsp");
		requestDispatcher.forward(request, response);
				
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Customer customer = new Customer();
		
		customer.setName(request.getParameter("name"));
		customer.setCity(request.getParameter("city"));
		customer.setGrade(request.getParameter("grade"));
		customer.setSalesman(Integer.parseInt(request.getParameter("salesman")));
		
		CustomerDAO.create(customer);
				
		doGet(request, response);
		
		
		
	}

}
