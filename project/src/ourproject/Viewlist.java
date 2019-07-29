package ourproject;

import java.sql.Statement;
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
@WebServlet("/Viewlist")
public class Viewlist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title></title></head>");
	     out.println("<body bgcolor='#j784y'>");
	    out.println("<form action='Emprecordview'>");
	     String qry = "SELECT employeeid,Firstname,Lastname from applicationtable1";
	     try (
					Connection conn=Dbutils.buildConnection();
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(qry);
	    		 )
				{
			while(rs.next())
			{
				
				 String fname=rs.getString(1);
		     		String mname=rs.getString(2);
		     		String lname=rs.getString(3);
		     		out.println("<font align='center'>");
		   	     out.println("<h2>");
		   	     out.println(fname+" "+mname+" "+lname);
		   	     out.print("</h2>");
		   	    out.println("<div class='button'>");
	             out.print("<a><button type='submit' name='wanted' value="+fname+" />click to view</a>");
	             out.println("</div>");
              out.println("</font>");
              out.println("</form>");
out.println("</body>");
}


}
catch(Exception e) {
out.println("Error here: " + e.getMessage());
}

	}

}
