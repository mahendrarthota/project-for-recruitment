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

/**
 * Servlet implementation class Adminsubmittedstatus
 */
@WebServlet("/Adminsubmittedstatus")
public class Adminsubmittedstatus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		int rowsaffected=0;
		String empstatus=request.getParameter("admstatus");
		String empid1=request.getParameter("adminsubmittedid");
		String admincomments=request.getParameter("comments");
		
		
	
		
		String sql="insert into adminstatus values(?,?,?)";
		
		
		try (
				Connection conn=Dbutils.buildConnection();
				PreparedStatement pst=conn.prepareStatement(sql);	
				
			)
		{
			
			    pst.setString(1,empid1);
				pst.setString(2,empstatus);
				pst.setString(3,admincomments);
				rowsaffected=pst.executeUpdate();
				out.println("<h2 style='align:center;'> succesfully Submitted</h2>");
				out.println("<a href='AdminLogin.html'>Click Here For Home</a>");
				
		}
		catch(Exception e)
		{
			out.println(rowsaffected  +"u cannot do this    "+e);
			
		
		
	}
		}
	}