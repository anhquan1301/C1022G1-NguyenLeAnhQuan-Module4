<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/27/2023
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiment</title>
</head>
<body>
<h2>Sandwich Condiment</h2>
<form action="/sandwich-condiment" method="get">
<div class="form-check">
    <label class="form-check-label">
        <input type="checkbox" class="form-check-input" name="condiment" value="Lettuce">
        Lettuce
    </label>
    <label class="form-check-label">
        <input type="checkbox" class="form-check-input" name="condiment" value="Tomato">
        Tomato
    </label>
    <label class="form-check-label">
        <input type="checkbox" class="form-check-input" name="condiment" value="Mustard">
        Mustard
    </label>
    <label class="form-check-label">
        <input type="checkbox" class="form-check-input" name="condiment" value="Sprouts">
        Sprouts
    </label>
    <input type="submit" value="submit">
</div>
</form>
<div>${condiment}</div>
</body>
</html>
