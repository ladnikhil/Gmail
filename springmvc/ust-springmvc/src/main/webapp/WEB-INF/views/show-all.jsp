<%@page import="com.ust.ustspringmvc.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    List<Employee> employees = (List)request.getAttribute("list");
    Employee emp = (Employee)session.getAttribute("emp");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show all</title>
</head>
<body>

<a href="./home">home
</a>

<div align="right">

	<span><a href="./update">update profile</a></span>
	
	<span><a href="./delete?id=<%=emp.getId()%>">delete profile</a></span>
	
	<span><a href="./logout">Logout</a></span>

</div>

<div>
	<a href="./home"></a>
</div>


<table>
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Dob</th>
	<th>Email</th>
	
	</tr>
	
	<%
	for(Employee employee : employees)
	{
	%>
	
	<tr>
		<td><%=employee.getId() %></td>
		<td><%=employee.getName() %></td>
		<td><%=employee.getDob() %></td>
		<td><%=employee.getEmail() %></td>
	</tr>
	
	<%
	}
	%>

</table>

</body>
</html>