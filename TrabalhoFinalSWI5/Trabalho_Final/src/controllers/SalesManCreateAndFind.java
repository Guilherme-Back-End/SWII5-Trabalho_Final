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
import dao.SalesManDAO;
import model.Customer;
import model.SalesMan;


@WebServlet("/SalesManCreateAndFind")
public class SalesManCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SalesManCreateAndFind() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	SalesMan salesman = new SalesMan();
		
		salesman.setName(request.getParameter("name"));
		salesman.setCity(request.getParameter("city"));
		salesman.setCommission(Double.parseDouble(request.getParameter("commission")));
				
		SalesManDAO.create(salesman);
		
		doGet(request, response);
	}

}
