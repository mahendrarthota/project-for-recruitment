package ourproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String userid=request.getParameter("un");
		String pass=request.getParameter("pwd");
		
		  String sql = "insert into user1 values(?,?)";
		  
		try( Connection con=Dbutils.buildConnection();
				PreparedStatement pst=con.prepareStatement(sql);
				)
		{
		    pst.setString(1,userid);
		    pst.setString(2,pass);
	    	  int rs = pst.executeUpdate();
	    	  out.println("data enterd successfully"+rs);
		}
			
		catch(Exception e)
		{
			out.println("u are in catch"+e);
		}
	}

	
}
