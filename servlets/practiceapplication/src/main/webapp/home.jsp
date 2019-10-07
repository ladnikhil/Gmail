<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="std" class="com.dev.bean.StudentBean" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homepage</title>
</head>
<body>

<h1>welcome to <%=std.getName() %></h1>


<a href="./search">search student</a><br/>


<a href="./update">update student</a><br/>

<a href="./delete?id=<%=std.getId()%>">delete your account</a><br/>

<a href="./logout">logout</a>
</body>
</html>