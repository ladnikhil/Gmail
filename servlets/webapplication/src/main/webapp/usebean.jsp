<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="error.jsp" %>
 <jsp:useBean id="emp1" class="com.ustglobal.mywebapp.dto.EmployeeInfoBean" scope="application"></jsp:useBean>
<% int i = 1/0; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><%=emp1.getEmpName() %></h1>
<h1><%=emp1.getEmpId()%></h1>

</body>
</html>