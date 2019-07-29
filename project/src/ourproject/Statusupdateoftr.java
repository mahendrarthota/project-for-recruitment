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

@WebServlet("/Statusupdateoftr")
public class Statusupdateoftr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		int rowsaffected=0;
		AdminStatus adm=new AdminStatus();
		String empidtr=request.getParameter("adminid1");
		String emptrstatus=request.getParameter("trstatus");
		String trcomment=request.getParameter("trcomments");
		EmployeeDAO adm1=new EmployeeDAO();
		AdminStatus ad=new AdminStatus(empidtr,emptrstatus,trcomment);
		adm1.update1(ad);
		out.println("<h2 style='align:center;'> succesfully Submitted</h2>");
		out.println("<a href='TrHome.html'><h2>Click Here To GO Home</h2></a>");

	}

	
}
