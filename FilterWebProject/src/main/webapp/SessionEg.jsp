<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String username=request.getParameter("uname");  %>
USERNAME:<font color="red"><%=username%></font><br>
<%String password1=request.getParameter("passw");  %>
PASSWORD: <font color="green">   <%=password1%></font><br>
Sessionid:<%=session.getId() %><br>
Date createTime = <%=session.getCreationTime()%><br>
 Date lastAccessTime =<%=session.getLastAccessedTime()%>
<%session.setAttribute("shareData",username);
session.setAttribute("shareData1",password1);%></body>
<br><a href="SessionEg2.jsp">next session</a><br>
</html>