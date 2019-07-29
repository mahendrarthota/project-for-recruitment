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


@WebServlet("/Viewlistofhr")
public class Viewlistofhr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		String searchno1=request.getParameter("wanted");
		out.println("<html><head><title></title></head>");
	     out.println("<body bgcolor='#j784y' background='apply.png'>");
	    out.println("<form action='Statusupdateofhr'>");
	     
		   	    out.println("<table border=' ' border='1' cellspacing='1' cellpadding=2' width='1350'>");
		   	    out.println("<tr>");
		   	 
		   
out.println("<td>");

 out.println("<input type='radio' name='hrstatus' value='recruited' checked/>"+"Select into Employeement");
 out.println("</td>");

out.println("<td>");
 out.println("<input type='radio' name='hrstatus' value='canceled'/>applicant cancled");
 out.println("</td>");
 out.println("<td>");
 out.println(" Employee Id:  <input type='text' name='adminsubmittedid2' value="+searchno1+" required / >");
 out.println("</td>");
 out.println("<td>");
 out.println("<textarea rows='5' cols='50' name='hrcomment' placeholder='Comments please'></textarea>");
 out.println("</td >");
 out.println("<td>"); 
 
 out.println("<input type='submit' value='submit' />");
 
 out.println("</td>");
 
              out.println("</font>");
              out.println("</form>");
out.println("</body>");
out.println("<html>");
}


}





