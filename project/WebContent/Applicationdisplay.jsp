<%@page import="java.util.Collection"%>
<%@page import="ourproject.Application"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

  
  <% Collection<Application> EmployeesData = (Collection<Application>)request.getAttribute("ApplicationCollectionObject"); 
  for(Application ss : EmployeesData) {
		out.println("<tr><td>"+ss.getEmployeeid()+"</td>"
			    +"<td>"+ss.getFirstname()+"</td>"
			    +"<td>"+ss.getLastname()+"</td>"
			    +"<td><button><a href="+"Emprecordview?wanted="+ss.getEmployeeid()+">View Application</a></button></td></tr>"
				);
	}
  %>

  
</table>
</body>
</html>