
   
    <%@page import="java.util.Date" %>
    <%@ page contentType="text/html" %>
    <%--  <%@ page contentType="application/msword" %> --%>
     <%@page buffer="16kb" %> <%--//allocating memory space --%>
     <%@page info="page created for jsp training" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jsp Directives</title>
</head>
<body><b>demonstrate Page Directives</b><br>
today:<%=new Date() %>
<form>

<input type="submit" value="redirect"></form>

</body>
</html>