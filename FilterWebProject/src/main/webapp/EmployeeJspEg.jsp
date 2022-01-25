
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<!-- used for referring your bean class -->
<jsp:useBean id="userinfo" class="jspemployee.EmployeeBeanJspEg"></jsp:useBean>

<!-- mapped the properties of bean class and jsp form fields using set property action tag
"8" propery  to map value based on the "name field -->
<jsp:setProperty property="*" name="userinfo"/>
Your details:
USERNAME:<jsp:getProperty property="username" name="userinfo"/><br>
USERAGE:<jsp:getProperty property="userAge" name="userinfo"/><br>
PASSWORD:<jsp:getProperty property="password" name="userinfo"/><br>


</body>
</html>