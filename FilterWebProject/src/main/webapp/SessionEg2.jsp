<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String username=(String)session.getAttribute("shareData"); %><br>
<%String password1=(String)session.getAttribute("shareData1"); %><br>
Welcome<%=username%> and <%=password1 %><br>
Sessionid:<%=session.getId() %><br>
Date createTime = <%=session.getCreationTime()%><br>
 Date lastAccessTime =<%=session.getLastAccessedTime()%><br>

</body>
</html>