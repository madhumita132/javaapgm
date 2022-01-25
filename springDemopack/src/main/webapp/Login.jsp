<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC DEMOe</title>
</head>
<body><center>
<h2>login</h2>
<p> This content is printed from login.jsp page and this is the home page. In Spring Web MVC, 
the 'DispatcherServlet' class works as the front controller. It is responsible to manage the flow of the
Spring mvc application. 
DispatcherServlet Configuration file Name should be, <br>
                         Syntax: DispatcherServletName-servlet.xml (as mentioned in the web.xml file) <br>
                         Example: welcomecontroller-servlet.xml  </p>

<form action="validate.html" method="post">
<table>
<tr>
<td><label>name</label></td>
<td><input type="text" name="name"/></td>
</tr>
<tr>
<td><label>password</label></td>
<td><input type="text" name="pwd"/></td>
</tr>
<tr><td><input type="submit" value="click"/></td></tr>
</table></form></center>
</body>
</html>