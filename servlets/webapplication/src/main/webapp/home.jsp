<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <jsp:useBean id="bean" class="com.ustglobal.mywebapp.dto.EmployeeInfoBean" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="./deletejspservlet?id=<%=bean.getEmpId()%>">delete</a>
<a href="./logoutjspservlet">logout</a>


<h1>welcome <%=bean.getEmpName() %></h1>
</body>
</html>