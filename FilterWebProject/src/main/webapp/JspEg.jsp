<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Example</title>
</head>
<body>
1.XML Equivalent:<br>
<jsp:scriptlet>
out.println("a scriptlet method,variables,"+ "or expression are valid in the page scripting lang");
</jsp:scriptlet>
<br>
2.scriptlet:<br>
<%out.println("jsp scriptlet");%>
<%--comment will not be visible in page source --%>
<b>java fullstack training</b>

<jsp:forward page="JspEg2.jsp">
</body>
</html>