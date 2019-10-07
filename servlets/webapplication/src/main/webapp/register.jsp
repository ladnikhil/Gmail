<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="./registerservlet" method="post">
<table>
  <tr>
    <th>Emp id</th>
    <td><input type="number" name="id" required></td>
  </tr>
  
   <tr>
    <th>Emp password</th>
    <td><input type="password" name="password" required></td>
  </tr>
  
  <tr>
    <th>Employee name</th>
    <td><input type="text" name="name" required></td>
  </tr>
  
  <tr>
    <th>Employee age</th>
    <td><input type="number" name="age" required></td>
  </tr>
  
  <tr>
    <th>Employee salary</th>
    <td><input type="number" name="salary" required></td>
  </tr>
  
  <tr>
    <th>Employee designation</th>
    <td><input type="text" name="designation" required></td>
  </tr>
  
  <tr>
    
    <td colspan="2"><br/><input type="reset"></td>
     <td colspan="2"><br/><input type="submit"></td>
  </tr>
</table>

</form>
</body>
</html>