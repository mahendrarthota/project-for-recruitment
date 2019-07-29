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
public class DeleteApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id1 = request.getParameter("id");
		System.out.println("id "+id1);
		EmployeeDAO sd = new EmployeeDAO();
		
		if(sd.deleteByNumber(id1)) {
			request.setAttribute("message", "Deleted Successfully");
			RequestDispatcher rd = request.getRequestDispatcher("NewFile.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("message", "Successfully Entered");
			RequestDispatcher rd = request.getRequestDispatcher("AdminLogin.html");
			rd.forward(request, response);
		}
	}

}
