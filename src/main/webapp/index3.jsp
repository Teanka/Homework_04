<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: teanka
  Date: 27.10.18
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="someName" value="Witaj w coderslab."/>


<c:if test="${fn:containsIgnoreCase(value, 'coderslab')}">
    <p>OK</p>
</c:if>


</body>
</html>
<%--Zadanie 3--%>

<%--W projekcie stwórz stronę jsp index3.jsp. Następnie:--%>

<%--Za pomocą odpowiedniej funkcji jstl sprawdź czy ustawiony za pomocą poniższego tagu ciąg znaków zawiera napis coderslab:--%>

<%--<c:set var="someName" value="Witaj w coderslab."/>--%>

<%--Jeżeli napis zawiera coderslab w instrukcji sterującej wypisz na stronie <p>OK</p>.--%>
