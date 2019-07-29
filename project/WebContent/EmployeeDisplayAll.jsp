<%@page import="java.util.Collection"%>
<%@page import="ourproject.Employee"%>
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
    <th>Name</th>
    <th>UserName</th> 
    <th>Email</th>
    <th>Phone</th>
    <th>Address</th>
    <th>Role</th>
    <th>View Application</th>
  </tr>

  
  <% Collection<Employee> EmployeesData = (Collection<Employee>)request.getAttribute("EmployeeCollectionObject"); 
  for(Employee ss : EmployeesData) {
		out.println("<tr><td>"+ss.getName()+"</td>"
			    +"<td>"+ss.getUserName()+"</td>"
			    +"<td>"+ss.getEmail()+"</td>"
			    +"<td>"+ss.getPhone()+"</td>"
			    +"<td>"+ss.getAddress()+"</td>"
			    +"<td>"+ss.getRoleid()+"</td>"
			    +"<td><button><a href="+"DeleteServlet?id="+ss.getId()+">Delete</a></button></td></tr>"
				);
	}
  %>

  
</table>
</body>
</html>