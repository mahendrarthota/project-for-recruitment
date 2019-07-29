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
 * Servlet implementation class StudentDisplayAll
 */
@WebServlet("/EmployeeDisplay")
public class EmployeeDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		EmployeeDAO sd = new EmployeeDAO();
		
		Collection<Employee> EmployeesData = sd.getAll();
		
//		for(Student ss: studentsData) {
//			System.out.println(ss);
//		}

		if (EmployeesData.isEmpty()) {
			request.setAttribute("message", "employee not there");
			RequestDispatcher rd = request.getRequestDispatcher("AdminHome.jsp");
			rd.forward(request, response);

		}

		else {

			request.setAttribute("EmployeeCollectionObject", EmployeesData);
			RequestDispatcher rd = request.getRequestDispatcher("EmployeeDisplayAll.jsp");
			rd.forward(request, response);

		}
	}

}


