<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Collection"%>
<%@page import="ourproject.Application"%>
<%@page import="ourproject.AdminStatus"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Display</title>
<link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
<ul>
  <li style="float:right"><a href="AdminLogin.html">Go Back</a></li>
</ul>
<p>
<p style="color:red;"><b>${message}</b></p>
<h2 align="center">Employee Details</h2>
<table border="2">

  <tr>
    <th>EmpID</th>
    <th>FirstName</th> 
    <th>LastName</th>
    <th>View Application</th>
  </tr>

  
  <%
     
  Collection<Application> EmployeesData = (Collection<Application>)request.getAttribute("ApplicationCollectionObject"); 
    Collection<AdminStatus> Status = (Collection<AdminStatus>)request.getAttribute("AdminStatusCollectionObject"); 
  for(Application ss : EmployeesData) {
		out.print("<tr><td>"+ss.getEmployeeid()+"</td>"
			    +"<td>"+ss.getFirstname()+"</td>"
			    +"<td>"+ss.getLastname()+"</td>");
			    for(AdminStatus s :Status)
			    	out.print("<td>"+s.getStatus()+"</td>"
			        +"<td><button><a href="+"DeleteServlet?wanted="+ss.getEmployeeid()+">Delete Application</a></button></td></tr>"
				);
	}
  %>

  
</table>
</body>
</html>