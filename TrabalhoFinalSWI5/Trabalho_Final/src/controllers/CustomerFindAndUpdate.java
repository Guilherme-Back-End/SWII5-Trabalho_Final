package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import model.Customer;

@WebServlet("/CustomerUpdate")
public class CustomerFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CustomerFindAndUpdate() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int customerId = Integer.parseInt(request.getParameter("customerId"));	
		Customer customer = CustomerDAO.findByPk(customerId);
		
		request.setAttribute("customer", customer);
		RequestDispatcher rd = request.getRequestDispatcher("formUpdate.jsp");
		rd.forward(request, response);
					
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Customer customer = new Customer();
		customer.setId(Integer.parseInt(request.getParameter("id")));
		customer.setName(request.getParameter("name"));
		customer.setCity(request.getParameter("city"));
		customer.setGrade(request.getParameter("grade"));
		customer.setSalesman(Integer.parseInt(request.getParameter("salesman")));
		
		CustomerDAO.update(customer);
		
		
		CustomerCreateAndFind customerCreateAndFind = new CustomerCreateAndFind();
		customerCreateAndFind.doGet(request, response);
		
		
	}

}
