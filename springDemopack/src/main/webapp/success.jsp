<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SUCCESSPAGE</title>
</head>
<body>
<center>
<h2>login successful</h2>
welcome <c:out value="${message}"></c:out><br><br>
<a href="${pageContext.request.contextPath}/Login.jsp">home</a> 
</center>
</body>
</html>