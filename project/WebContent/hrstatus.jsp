<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.Collection"%>
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
  <li style="float:right"><a href="TrHome.html">Go Back</a></li>
</ul>
<p>
<p style="color:red;"><b>${message}</b></p>
<h2 align="center">Employee Details</h2>
<table border="2">

  <tr>
    <th>EmpID</th>
    <th>Status</th> 
    <th>Review</th>
    <th>Edit Status</th>
  </tr>

  
  <% Collection<AdminStatus> EmployeesData = (Collection<AdminStatus>)request.getAttribute("AdminStatusCollectionObject"); 
  for(AdminStatus ss : EmployeesData) {
		out.println("<tr><td>"+ss.getEmployeeid()+"</td>"
			    +"<td>"+ss.getStatus()+"</td>"
			    +"<td>"+ss.getReview()+"</td>"
			    +"<td><button><a href="+"Viewlistofhr?wanted="+ss.getEmployeeid()+">Click Edit Status</a></button></td></tr>"
				);
	}
  %>

</body>
</html>