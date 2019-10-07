<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search student here</title>
</head>
<body>
<form action="./search" method="post">
<table>
<legend>search a student</legend>
<tr>
	<td>student id</td>
   
    <td><input type="number" name="id" required></td>
</tr>


  <tr>
    
    <td colspan="2"><br/><input type="submit" value="search"></td>
  </tr>
</form>
</body>
</html>