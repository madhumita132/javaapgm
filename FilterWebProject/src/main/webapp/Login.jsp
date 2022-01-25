<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <c:set var="uname" value="${param.name}"/>
<h2>welcome <c:out value="${uname}"/></h2>--%>


<%String username=request.getParameter("uname");  
String password=request.getParameter("pass");  %>
USERNAME:<%=username%>
PASSWORD:<%=password%>
<%if(username.equals("madhu")&&password.equals("mita")){
	response.sendRedirect("Cset.jsp");}
else{
	response.sendRedirect("CoreToken.jsp");}
	%>
}
</body>
</html>