package ourproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteStudentServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDAO sd = new EmployeeDAO();
		
		if(sd.deleteByIdentity(id)) {
			request.setAttribute("message", "Deleted Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("wrong.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("message", " Not Deleted Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("wrong.jsp");
			rd.forward(request, response);
		}
	}

}
