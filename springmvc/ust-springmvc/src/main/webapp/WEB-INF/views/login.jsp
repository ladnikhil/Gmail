<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login here</title>
</head>
<body>

<form action="./login" method="post">


<table>
	  <tr>
    	<td>Email:</td>
    	<td><input type="email" name="email" required="required"></td>
 	  </tr>
 	  
 	  <tr>
    	<td>Password:</td>
    	<td><input type="password" name="password" required="required"></td>
 	  </tr>
 	  
 	   <tr>
    	
    	<td><input type="submit" value="Sign in" ></td>
 	  </tr>
 	  
 	  

</table>

</form>

<a href="./register">Sign up</a>

<h3>${msg}</h3>

</body>
</html>