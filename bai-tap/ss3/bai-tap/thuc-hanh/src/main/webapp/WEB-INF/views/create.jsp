<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/28/2023
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm mới nhân viên</title>
</head>
<body>
<h2>Thêm mới nhân viên</h2>
<form:form modelAttribute="employee" action="/employee/create" method="post">
    <div class="form-group">
        <label for="name"></label>
        <form:input type="text" path="name" id="name"/>
    </div>
    <div class="form-group">
        <label for="contactNumber"></label>
        <form:input type="text" path="contactNumber" id="contactNumber"/>
    </div>
    <input class="btn btn-primary" type="submit" value="submit">
</form:form>
</body>
</html>
