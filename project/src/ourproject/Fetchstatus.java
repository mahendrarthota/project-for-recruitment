package ourproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fetchstatus
 */
@WebServlet("/Fetchstatus")
public class Fetchstatus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title></title></head>");
	     out.println("<body bgcolor='white' background='13th.jpg' norepeat>");
	 
	     String sql = "SELECT status from adminstatus where employeeid=?";
	     String ref=request.getParameter("refid");
	     try (
					Connection conn=Dbutils.buildConnection();
	    		 PreparedStatement pst=conn.prepareStatement(sql);
	    		 ){
	             pst.setString(1,ref);
	    		 ResultSet rs = pst.executeQuery();
				
			if(rs.next())
			{
		     		String status2=rs.getString(1);
		     		out.println("<font align='center' >");
		   	    out.println("<table border=' ' align='right' bgcolor='#f6567' width='500'>");
		   	    out.println("<tr>");
		   	 out.print("<td><h3>"+"Refernceid :"+"</h3>"+"<h5>"+ref+"</h5></td>");
		   	 out.print("<td><h3>"+"Your status :"+"</h3>"+"<h5>"+status2+"</h5></td>");
		   	 out.println("</tr>");
              out.println("</font>");
              out.println("</form>");
out.println("</body>");
out.println("<html>");
}

			else
			{
				 out.print("<h2>"+"Application is in process"+"</h2>");
				 out.print("<h2>"+"Application is in process"+"</h2>");
				
			}

}
catch(Exception e) {
out.println("Error here: " + e.getMessage());
}

	}
	
	}

	


