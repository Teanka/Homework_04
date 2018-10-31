<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: teanka
  Date: 28.10.18
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="">
    <%--<c:out value="${language}" default="ymm"/>--%>
    <%--${language}<br>--%>
        Wylot z: <br>
    <select id="outbound" name="outbound">
        <c:forEach var="airport"
                   items="${airportList}">
            <option value="airport ${airport.name}">${airport.name}</option>
            <br>
        </c:forEach>
    </select>
    <br>
        Przylot do:<br>
    <select id="inbound" name="inbound">

        <c:forEach var="airport"
                   items="${airportList}">
            <option value="airport${airport.name}">${airport.name} </option>
            <br>
        </c:forEach>
    </select>
    <br>
        Czas startu: (w formacie MM-dd-yyyy HH: MM) <br>
        <input id="time" type="datetime-local" min = "dNow" name="flightTime" >
        <%--<fmt:formatDate value="${timeVar}" pattern="MM-dd-yyyy HH: MM: SS" />--%>
        <br>
        Długość lotu:<br>
        <input id="flightHours" type="number" name="flightHours" min="0" step="1" required>
        h<br>
        Cena lotu:<br>
        <input id="price" type="number" name="price" min="0" step="0.01" required>
        <br>
    <input type="submit" value="Zatwierdź">
</form>
<br>
</body>
</html>
<%--Stwórz, w pliku jsp, formularz, który przesyła dane metodą POST. Formularz powinien zawierać:--%>

<%--Lotnisko wylotu - pole select (dane pobrane przez dao).--%>
<%--Lotnisko przylotu - pole select(dane pobrane przez dao).--%>
<%--Czas startu - pole datetime-local (będzie to czas wylotu w czasie lokalnym lotniska).--%>
<%--Długość lotu w godzinach - pole number min="0", step="1".--%>
<%--Cenę lotu - pole number min="0", step="0.01".--%>

