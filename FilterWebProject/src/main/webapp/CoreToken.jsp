<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>example 1:</b><br>
<c:forTokens items="madhu-abi-jaya" delims="-" var="name">
<c:out value="${name}"/><br>
</c:forTokens>
<b>example 2:</b><br>
<c:forTokens items="mahe-abir-jayas" delims="-" var="emp">
<c:out value="${emp }"/><p>
</c:forTokens>
</html>