package ourproject;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewStatushr
 */
@WebServlet("/ViewStatushr")
public class ViewStatushr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		  EmployeeDAO sd = new EmployeeDAO();
		  Collection<AdminStatus> EmployeesData = sd.getAllStatus();
		
		if(EmployeesData.isEmpty()) {
			request.setAttribute("message", "no records to fetch");
			RequestDispatcher rd = request.getRequestDispatcher("NewFile.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("AdminStatusCollectionObject", EmployeesData);
			RequestDispatcher rd = request.getRequestDispatcher("hrstatus.jsp");
			rd.forward(request, response);
	}

}
}
