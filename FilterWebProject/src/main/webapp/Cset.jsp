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
<%--usage of set tag 
It is used to set the result of an expression evaluated in a 'scope'. 
The <c:set> tag is helpful because it evaluates the expression and use the result to set a value of java.util.Map or JavaBean.
Scope can 2 variables(request,session)
request-->valu of set obj  to be maintained with the forward page through the scope attribute
session-->                                   till the session scope (between login nd logout) session
This tag is similar to jsp:setProperty action tag.--%>
<c:set var="income" value="${4000*4 }" scope= "session"/>
<c:out value="value of income is:"/>
<c:out value="${income}"/><br>

<%--usage:removal tag:remove the variable from the session scope and clean up any scope resource --%>

<c:remove var="income"/>
<c:out value="value of income is:"/>
<%--after removal value is not printed the scope is removed --%>
<c:out value="${income}"/>

</body>
</html>