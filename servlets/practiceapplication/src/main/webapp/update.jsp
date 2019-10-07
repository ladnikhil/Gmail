<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update  here</title>
</head>
<body>

<form action="./update" method="post">
<table>
  <tr>
    <th>student id</th>
    <td><input type="number" name="id" required></td>
  </tr>
  
   <tr>
    <th>student password</th>
    <td><input type="password" name="password" required></td>
  </tr>
  
  <tr>
    <th>student name</th>
    <td><input type="text" name="name" required></td>
  </tr>
  
  <tr>
    <th>student age</th>
    <td><input type="number" name="age" required></td>
  </tr>
  
  
    
    <td colspan="2"><br/><input type="reset"></td>
     <td colspan="2"><br/><input type="submit"></td>
  </tr>
</table>
</form>
</body>
</html>