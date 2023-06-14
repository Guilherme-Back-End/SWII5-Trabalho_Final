package controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.Customer;
import model.Order;
import dao.CustomerDAO;
import dao.OrderDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/OrderCreateAndFind")
public class OrderCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public OrderCreateAndFind() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pesquisa = request.getParameter("pesquisa");
		
		if(pesquisa==null) {
			pesquisa="";			
		}
		
		List<Order> orders = OrderDAO.find(pesquisa);
		
		request.setAttribute("orders", orders);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaOrders.jsp");
		requestDispatcher.forward(request, response);
				
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		Order order = new Order();

		System.out.println("SIMPLE DATE");
		
			
			order.setPurch_amt(Double.parseDouble(request.getParameter("purch_amt")));
			order.setOrd_date(request.getParameter("ord_date"));
			order.setCustomer_id(Integer.parseInt(request.getParameter("customer_id")));
			order.setSalesman_id(Integer.parseInt(request.getParameter("salesman_id")));
		
			OrderDAO.create(order);
		
			doGet(request, response);
	}

}
