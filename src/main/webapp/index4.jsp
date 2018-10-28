<%--
  Created by IntelliJ IDEA.
  User: teanka
  Date: 28.10.18
  Time: 09:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/Servlet_01_2">
    <%--<c:out value="${language}" default="ymm"/>--%>
    ${language}<br>
    <select id="langua" name="langua">

        <option value="en">en</option>
        <option value="pl">pl</option>
        <option value="de">de</option>
        <option value="es">es</option>
        <option value="fr">fr</option>
    </select>
    <br>
    <input type="submit" value="Wybierz język">
</form>
<br>
<%--${lang [${cookie.language.value}]}--%>
</body>
</html>
