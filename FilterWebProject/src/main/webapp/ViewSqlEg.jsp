<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/product" 
                       user="root" password="madhu"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JQL Query Example</title>
</head>
<body>
<sql:query var="prod" dataSource="${dataSource}">
select * from product;
</sql:query>
<table border=1>
<tr>
<th>product_id</th>
<th>product_name</th>
<th>price</th>
<th>quantity</th>
</tr>
<c:forEach var="rowRef" items="${prod.rows}">
<tr>
<td><c:out value="${rowRef.pid }"/></td>
<td><c:out value="${rowRef.pname }"/></td>
<td><c:out value="${rowRef.pqty }"/></td>
<td><c:out value="${rowRef.pprice }"/></td>
</tr>

</c:forEach>
</table>
</body>

</html>