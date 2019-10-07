<%@page import="com.ust.ustspringmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    Employee employee = (Employee) session.getAttribute("emp");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page </title>
</head>
<body>

<div align="right">

	<span><a href="./update">update profile</a></span>
	
	<span><a href="./delete?id=<%=employee.getId()%>">delete profile</a></span>
	
	<span><a href="./logout">Logout</a></span>

</div>


<h1>welcome <%=employee.getName() %></h1>


<a href="./show-all">show all employees</a>

<h3>${msg}</h3>



</body>
</html>