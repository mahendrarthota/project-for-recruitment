package ourproject;

import java.sql.Statement;
import java.util.Collection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Viewlistofapplicant
 */
@WebServlet("/Viewlistofapplicant")
public class Viewlistofapplicant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		RequestDispatcher disp=null;
         EmployeeDAO sd = new EmployeeDAO();
		
		Collection<Application> EmployeesData = sd.getAllApply();
		
		if (EmployeesData.isEmpty()) {
			request.setAttribute("message", "employee not there");
			RequestDispatcher rd = request.getRequestDispatcher("AdminLogin.html");
			rd.forward(request, response);

		}

		else {

			request.setAttribute("ApplicationCollectionObject", EmployeesData);
			RequestDispatcher rd = request.getRequestDispatcher("Applicationdisplay.jsp");
			rd.forward(request, response);

		}
	}
			



	}


