<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student login here</title>
</head>
<body>


<form action="./login" method="post">
<table>
<legend>login form</legend>
<tr>
	<td>student id</td>
   
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

<a href="./register">signup</a>

</body>
</html>