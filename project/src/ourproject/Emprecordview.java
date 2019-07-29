package ourproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Emprecordview
 */
@WebServlet("/Emprecordview")
public class Emprecordview extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      String title = "Database Result"; 
	      String searchno=request.getParameter("wanted");
	     String sql = "SELECT * from applicationtable1 where employeeid=?"; 	         
	      try (	Connection conn=Dbutils.buildConnection();
	    		  PreparedStatement pst=conn.prepareStatement(sql);	
	    		  ){
	    	  pst.setString(1,searchno);
	    	  ResultSet rs = pst.executeQuery();
	      if(rs.next())
	      {
	        	String fname=rs.getString(1);
	     		String mname=rs.getString(2);
	     		String lname=rs.getString(3);
	     		String email=rs.getString(4);
	     		String phonenumber=rs.getString(5);
	     		String degree=rs.getString(6);
	     		String degreemarks=rs.getString(7);
	     		String twelvestandard=rs.getString(8);
	     		String twelvemarks=rs.getString(9);
	     		String tenthstandard=rs.getString(10);
	     		String tenthmarks=rs.getString(11);
	     		String selecteddate=rs.getString(12);
	     		String jobteir=rs.getString(13);
	     		String jobstatus=rs.getString(14); 
	     		out.println("<html><head><title>Basic Form Processor Output</title></head>");
	   out.println("<form action='Adminsubmittedstatus'>");
	  	      out.println("<body background='apply.png'>");
	           out.println("<table border='1' align='center' width='700'>");
	           out.println("<caption><h2 style='color:green;'> Details of Employee</h2></caption>");
	             out.println("<tr>");
	            out.println("<td><h3>Name: </h3></td>"+ "<br>");
	            out.println("<td>" +"<h3>"+ fname+ "</h3>");
	            if(mname!=null)
	            	out.print("<h3>"+mname+"</h3>");
	            out.print("<h3>"+lname+"</h3> </td>"+ "<br>");
	            out.println("<td><h3>Employeeid: </h3>"+"<h4>"+ searchno+"</h4> </td>"+"<br>");
	            out.println("</tr>");
	            out.println("<tr>"); 
	            out.println("<td><h3>Contact Details:</h3></td>"+ "<br>");
	         
	            out.println("<br>"+"<td><h3>Email:</h3>" +"<h4>"+ email +"</h4></td>"+ "<br>");
	       	    out.println("<td><h3>PhoneNumber:</h3>" +"<h4>"+ phonenumber +"</h4></td>"+ "<br>");
	            out.println("</tr>");
	            out.println("<tr>");
	            out.println("<td><h3>Education Details</h3></td>"+ "<br>");
	            out.println("<td><h3>Graduation:</h3>" +"<h4>"+ degree +"</h4></td>"+ "<br>");
	           
	    
	            out.println("<td><h3>Graduation Score:</h3>" +"<h4>"+ degreemarks+"</h4></td>"+ "<br>");
	            out.println("</tr>");
	            out.println("<tr>");
	            
	            out.println("<td colspan='2'><h3>12<sup>th</sup> Board:</h3>" +"<h4>"+twelvestandard  +"</h4></td>"+ "<br>");
	          
	           
	            out.println("<td><h3> 12<sup>th</sup> Score:</h3>" +"<h4>"+ twelvemarks+"</h4></td>"+ "<br>");
	            out.println("</tr>");
	            out.println("<tr>");
	            out.println("<td colspan='2'><h3>10<sup>th</sup> Standard:</h3>" +"<h4>"+tenthstandard  +"</h4></td>"+ "<br>");
	          
	          
	            out.println("<td><h3> 10<sup>th</sup> Score:</h3>" +"<h4>"+ tenthmarks+"</h4></td>"+ "<br>");
	            out.println("</tr>");
	            out.println("<tr>");
	            out.println("<td colspan='3'><h3>Applying for:</h3>" +"<h4>"+jobteir +"</h4></td>"+ "<br>");
	            out.println("</tr>");
	            out.println("<tr>");
	            out.println("<td colspan='2'><h3> current status:</h3>"+"<h4>"+jobstatus +"</h4>"+"</td>"+ "<br>");
	            out.println("<td >");
	            out.println("<textarea rows='5' cols='50' name='comments' placeholder='Comments please'></textarea>");
	            out.println("</td >");
	            out.println("</tr>");
	            
	          out.println("</table>");
	          out.println("<table align='center'>");
	          out.println("<tr>");
	          out.println("<td>");
	          out.println("<br>");
	           out.println("<input type='radio' name='admstatus' value='totr' checked/>"+"forward to nextlevel");
	           
	           out.println("<a href="+"DeleteApplicationServlet?id="+searchno+">applicant cancled</a>");
	           out.println("</td>");
	           out.println("</tr>");
	           out.println("<tr>");
	           out.println("<td>");
	           out.println("<br>");
	           out.println("<pre>  EmployeeId:  <input tyep='text' name='adminsubmittedid' required value="+searchno+"></pre>");
	           out.println("</td>");
	           out.println("</tr>");
	           out.println("<tr>");
	           out.println("<td>");
	           out.println("<br>");
	           
	           out.println("<pre>                  <input type='submit' name='admopt' value='submit' /></pre>");
	           out.println("</td>");
	           out.println("</tr>");
	           out.println("</table>");
	          
	          out.println("</form>");
	         out.println("</body></html>");
	      }
	         // Clean-up environment
	        
	      } catch(SQLException se) {
	         //Handle errors for JDBC
	         se.printStackTrace();
	      } catch(Exception e) {
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      }
	}

}
