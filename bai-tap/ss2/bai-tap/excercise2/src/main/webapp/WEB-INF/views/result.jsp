<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/27/2023
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="/css/bootstrap-grid.min.css">
</head>
<body>
<h2 class="">Calculator</h2>
<form action="/calculator" method="get">
<div>
    <input type="text" value="${firstOperand}" name="firstOperand" required placeholder="Number One">
    <input type="text" value="${secondOperand}" name="secondOperand" required placeholder="Number Two">
</div>
<input type="submit" name="operand" value="Addition(+)">
<input type="submit" name="operand" value="Subtraction(-)">
<input type="submit" name="operand" value="Multiplication(*)">
<input type="submit" name="operand" value="Division(/)">
</form>
<h3>Result: ${result}</h3>
<script src="/js/bootstrap.js"></script>
</body>
</html>
