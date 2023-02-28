<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/28/2023
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Settings Form</title>
</head>
<body>
<h2>Settings Form</h2>
<table class="table">
  <thead>
  <tr>
    <th>ID</th>
    <th>Languages</th>
    <th>Page Size</th>
    <th>Spams filter</th>
    <th>Signature</th>
    <th></th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${settingList}" var="setting">
  <tr>
    <td scope="row">${setting.id}</td>
    <td>${setting.languages}</td>
    <td>${setting.pageSize}</td>
    <td>${setting.spamsFilter}</td>
    <td>${setting.signature}</td>
    <td><a href="/setting/edit-form">Edit</a></td>
  </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
