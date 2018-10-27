<%--
  Created by IntelliJ IDEA.
  User: teanka
  Date: 26.10.18
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Wybrany autor: ${param.author!= null ?  param.author : "brak autora"} </p>
</body>
</html>
