package ourproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Statusupdateofhr")
public class Statusupdateofhr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		int rowsaffected=0;
		AdminStatus adm=new AdminStatus();
		String empidhr=request.getParameter("adminsubmittedid2");
		String emphrstatus=request.getParameter("hrstatus");
		String hrcomments=request.getParameter("hrcomment");
		EmployeeDAO adm1=new EmployeeDAO();
		AdminStatus ad=new AdminStatus(empidhr,emphrstatus,hrcomments);
		adm1.update1(ad);
		out.println("<h2 style='align:center;'> succesfully Submitted</h2>");
		out.println("<a href='HrHome.html'><h2>Click Here To GO Home</h2></a>");
		}
		
		
}
