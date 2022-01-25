<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp response page</title>
</head>
<body>
<!-- it is for linking and referring java bean class -->
<jsp:useBean id="empDetails" class="jspemployee.EmployeeBeanJspEg" />
<jsp:setProperty property="*" name="empDetails"/>
Employeename :<jsp:getProperty property="empName" name="empDetails"/><br><br>
EmployeeID :<jsp:getProperty property="eno" name="empDetails"/><br><br>
salary:<jsp:getProperty property="salary" name="empDetails"/><br><br>
hired_datE:<jsp:getProperty property="hireddate" name="empDetails"/><br><br>
</body>
</html>