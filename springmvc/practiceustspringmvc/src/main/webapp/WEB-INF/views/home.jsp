
<%@page import="com.ust.practiceustspringmvc.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
   Student student = (Student) session.getAttribute("std");
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
	
	<span><a href="./delete">delete profile</a></span>
	
	<span><a href="./logout">Logout</a></span>

</div>



<h1>welcome <%=student.getName() %></h1>







</body>
</html>