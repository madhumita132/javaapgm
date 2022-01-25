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
<c:set var="points" value="${200*20}" scope="request"></c:set>
<%="your reward points:" %>
<c:out value="${points}"/>
<c:choose>
<c:when test="${points<=10000}">
<%="your reward points are to improved" %></c:when>
<c:when test="${points>10000}">
<%="your reward points are good" %></c:when>
<c:otherwise>
<%="your reward points undetermined" %>
</c:otherwise>


</c:choose>

</body>
</html>