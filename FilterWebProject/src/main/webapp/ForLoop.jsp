
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>forloop</title>
</head>
<body>
<c:forEach var="i" begin="5" end="10">
Elements are:
<c:out value="${i}"/><br>

</c:forEach>
</body>
</html>