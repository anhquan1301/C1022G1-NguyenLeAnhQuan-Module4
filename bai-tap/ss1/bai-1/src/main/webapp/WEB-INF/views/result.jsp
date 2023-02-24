<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/24/2023
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Currency Conversion</h1>
<form action="/currency-conversion">
    <input type="text" name="usd" id="change" value="${usd}" placeholder="Input money">
    <input type="submit" value="Convert">
</form>
<h1>${result} VND</h1>
</body>
</html>
