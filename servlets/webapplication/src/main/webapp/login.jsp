<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>

<form action="./loginjsp" method="post">
<table>
<legend>login form</legend>
<tr>
	<td>employee id</td>
   
    <td><input type="number" name="id" required></td>
</tr>

 <tr>
    <td>password</td>
   
    <td><input type="password" name="password" required></td>
  </tr>
  
  <tr>
    
    <td colspan="2"><br/><input type="submit" value="login"></td>
  </tr>

</table>
</form>
<a href="./register.jsp">signup</a>
</body>
</html>