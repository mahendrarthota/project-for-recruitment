package ourproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int em=1,t=2,h=3;
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		String userid=request.getParameter("empid");
		String password=request.getParameter("pwd");
		
			String sqlquery="select * from employeedata";
			try (
				Connection conn=Dbutils.buildConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sqlquery);)
			{
				while(rs.next())
				{
					String emplog=rs.getString(3);
					String emppassword=rs.getString(4);
					int roleid=rs.getInt(8);
				  if((userid.equals(emplog))&&(password.equals(emppassword))&&(roleid==em))	  
			                 {   
			    	           out.println("welcome");
			    	           HttpSession session=request.getSession();
			    	           disp=request.getRequestDispatcher("LoginHome.html");
			    	           disp.forward(request, response);
			                 }
				   if((userid.equals(emplog))&&(password.equals(emppassword))&&(roleid==t))	  
			                  {   
			    	             out.println("welcome");
			    	             HttpSession session=request.getSession();
			    	             disp=request.getRequestDispatcher("TrHome.html");
			    	             disp.forward(request, response);
			                  }

					if((userid.equals(emplog))&&(password.equals(emppassword))&&(roleid==h))	  
			                    {   
			    	             out.println("welcome");
			    	             HttpSession session=request.getSession();
			    	              disp=request.getRequestDispatcher("HrHome.html");
			    	              disp.forward(request, response);
			                    	}
				}
				{
				out.println("<h1>opps! not permitted to enter.... please try agian</h1>");
				out.println("<h1>userid password was not correct</h1>");
				disp=request.getRequestDispatcher("yes.html");
				disp.include(request, response);
		 		}
				}
			catch(Exception e)
			{			
				out.println("Catch");
				e.printStackTrace();
		}
		
	}

	}



