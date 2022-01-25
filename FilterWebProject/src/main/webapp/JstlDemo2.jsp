<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp set value</title>
</head>
<body>
<h2>-----Page1------</h2>
<c:set var="data1" value="50"></c:set>
<c:set var="data2" value="${10*20}" scope="request"></c:set>
<c:set var="data3" value="Session-data" scope="session"></c:set>
<c:set var="data4" value="Application-data" scope="application"></c:set>
<%--forward object which takes input input from src  to dest 
(frwd(req,res)) of servlet --%>
<jsp:forward page="JstlDemo.jsp"></jsp:forward>
<%--navigate to another resources without taking input from current page --%>
<a href="JstlDemo.jsp">click</a>

<%-- <h3>data1: <c:out value="${data1}"></c:out></h3>
<h3>data2: <c:out value="${data2}"></c:out></h3>
<h3>data3: <c:out value="${data3}"></c:out></h3>
<h3>data4: <c:out value="${data4}"></c:out></h3>--%>

</body>
</html>