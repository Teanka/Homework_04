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
<%--&lt;%&ndash; if you want to select value from drop-downlist here is jsp code. &ndash;%&gt;--%>
<%--<body>--%>
<%--<form name="f1" method="get" action="#">--%>
<%--<select name="clr">--%>
<%--<option>Red</option>--%>
<%--<option>Blue</option>--%>
<%--<option>Green</option>--%>
<%--<option>Pink</option>--%>
<%--</select>--%>
<%--<input type="submit" name="submit" value="Select Color"/>--%>
<%--</form>--%>
<%--&lt;%&ndash; To display selected value from dropdown list. &ndash;%&gt;--%>

<%--</body>--%>
<%--<%--%>
<%--String s=request.getParameter("clr");--%>
<%--<c: if ${lang} !=null--%>
<%--{--%>
<%--System.out.println("Selected Color is : "+s);--%>
<%--}--%>
<%--%>--%>

<%--<c:out value="${cookie.language.value}" default="default value"/>--%>
<%--<p>Wybrany ${param.language!= null ?  param.language : "cześć"} </p>--%>
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
<c:out value="${lang['${cookie.}']}"/>
<%--${lang [${cookie.language.value}]}--%>
<c:set var="language" value="${language}"/>
<%--${language} <br>--%>


<%--<c:out value="${cookie.language.value}" default="cześć"/>--%>

</body>
</html>
