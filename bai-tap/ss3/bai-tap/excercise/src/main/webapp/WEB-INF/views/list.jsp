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
    <title>Box Emails</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
<h2 class="text-center">Box Emails</h2>
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
    <td><a class="btn btn-primary" href="/setting/edit-form/${setting.id}">Edit</a></td>
  </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
