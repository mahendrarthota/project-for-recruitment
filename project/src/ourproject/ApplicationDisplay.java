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
 * Servlet implementation class ApplicationDisplay
 */
@WebServlet("/ApplicationDisplay")
public class ApplicationDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
			RequestDispatcher rd = request.getRequestDispatcher("AppliedDisplayAll.jsp");
			rd.forward(request, response);

		}
	}
	}


