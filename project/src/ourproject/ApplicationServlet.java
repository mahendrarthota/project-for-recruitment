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
import javax.servlet.http.Part;

/**
 * Servlet implementation class ApllicationServlet
 */
@WebServlet("/ApplicationServlet")
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		int rowsaffected=0;
		String employeeid=request.getParameter("empaid");
		String fname=request.getParameter("fn");
		String mname=request.getParameter("mn");
		String lname=request.getParameter("ln");
		String email=request.getParameter("em");
		String phonenumber=request.getParameter("pn");
		String degree=request.getParameter("degree");
		String degreemarks=request.getParameter("dmarks");
		String twelvestandard=request.getParameter("twelve");
		String twelvemarks=request.getParameter("tmarks");
		String tenthstandard=request.getParameter("tenthstandard");
		String tenthmarks=request.getParameter("tenthmarks");
		String selecteddate=request.getParameter("dt");
		String jobteir=request.getParameter("ps");
		String jobstatus=request.getParameter("r1");
		
		String sql="insert into applicationtable2 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
	
			try (
					Connection conn=Dbutils.buildConnection();
					PreparedStatement pst=conn.prepareStatement(sql);	
					
				)

			{
				pst.setString(1,employeeid);
				pst.setString(2,fname);
					pst.setString(3,mname);
					pst.setString(4,lname);
					pst.setString(5,email);
					pst.setString(6,phonenumber);
					pst.setString(7,degree);
					pst.setString(8,degreemarks);
					pst.setString(9,twelvestandard);
					pst.setString(10,twelvemarks);
					pst.setString(11,tenthstandard);
					pst.setString(12,tenthmarks);
					pst.setString(13,selecteddate);
					pst.setString(14,jobteir);
					pst.setString(15,jobstatus);
					
					rowsaffected=pst.executeUpdate();
					out.println("<h2 style='align:center;'> succesfully entered</h2>");
					out.println("<a href='LoginHome.html'><h2>Click Here To GO Home</h2></a>");
			}
			catch(Exception e)
			{
				out.println(rowsaffected+"u cannot do this"+e);
				
			}
	

		}
	}

