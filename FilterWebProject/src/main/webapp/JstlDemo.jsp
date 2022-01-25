<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jstl Demo</title>
</head>
<body>
<h2>--page2--</h2>
<c:out value="${'welcome'}"/>
<h3>data1: <c:out value="${data1}"/></h3>
<h3>data2: <c:out value="${data2}"/></h3>
</body>
</html>