<%--
  Created by IntelliJ IDEA.
  User: teanka
  Date: 27.10.18
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="number" begin="2" end="10" step="2"
           items="${numbers}">
    ${number}<br>
</c:forEach>

</body>
</html>
