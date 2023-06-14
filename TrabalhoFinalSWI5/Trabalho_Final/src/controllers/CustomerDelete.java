package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;


@WebServlet("/CustomerDelete")
public class CustomerDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CustomerDelete() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		CustomerDAO.delete(customerId);
		
		CustomerCreateAndFind customerCreateAndFind = new CustomerCreateAndFind();
		customerCreateAndFind.doGet(request, response);
				
	}
}
