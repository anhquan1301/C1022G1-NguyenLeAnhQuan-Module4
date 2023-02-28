<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/28/2023
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<h2>Employee List</h2>
<form action="/employee">
    <a href="/employee/creation-form">Thêm mới nhân viên</a>
    <div class="form-group">
        <input type="text"
               class="form-control" name="name" id="name" aria-describedby="helpId" placeholder="">
        <input type="submit" value="Tìm kiếm">
    </div>
</form>
    <table class="table">
        <thead>
        <tr>
            <th>Id</th>
            <th>Tên</th>
            <th>SĐT</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${employeeList}" var="employee">
        <tr>
            <td scope="row">${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.contactNumber}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
