<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type"  content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
variable declaration using Xml tag:<br>
<jsp:declaration>
int data=3;
</jsp:declaration>
<br/>
<%out.println("value of data:"+data); %>
<b><br>2.variable declaration using scriptlet:<br/></b>

<p><%int day=2;%></p>

<%--comment will not be visible in page source --%>
<p>day: <%=day %></p>
 <!-- exp data to fetch in response -->

<% if(day==1|day==7){ %>
<b>today is weekend</b>
<% }else{ %>
<b>today is not weekend</b>
<% } %>
</body>
</html>