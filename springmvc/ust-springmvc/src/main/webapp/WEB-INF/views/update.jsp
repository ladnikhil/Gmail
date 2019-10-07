<%@page import="com.ust.ustspringmvc.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%
Employee employee = (Employee)session.getAttribute("emp");
%>


</head>
<body>

<div>
	<span><a href="./home">Home</a></span>
	<span style="float-right;"><a href="./logout">Home</a></span>
</div>



<form action="./update" method="post">
	<table>
	
	<tr>
    	<td>ID:</td>
    	<td><input type="number" name="id" value="<%=employee.getId()%>"   readonly="readonly"></td>
 	  </tr>
	
 	  
  <tr>
    	<td>Name:</td>
    	<td><input type="text" name="name" required="required" value="<%=employee.getName()%>"></td>
 	  </tr>
 	  
 	  <tr>
    	<td>DOB</td>
    	<td><input type="date" name="dob"></td>
 	  </tr>
 	  
 	  
 	  
 	  <tr>
    	<td>Password:</td>
    	<td><input type="password" name="password"  required="required" value="<%=employee.getPassword()%>"> </td>
 	  </tr>
 	  
 	  <tr>
    	
    	<td><input type="submit" ></td>
 	  </tr>
 	  
	</table>


</form>



</body>
</html>