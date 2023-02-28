<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/28/2023
  Time: 5:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit setting</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
<h2>Edit Settings</h2>
<form:form modelAttribute="setting" action="/setting/update" method="post">
<table>
    <div>
        <form:hidden path="id"/>
    </div>
    <tr>
        <th><label>Languages: </label></th>
        <td><form:select path="languages" items="${listLanguages}"/></td>
    </tr>
    <tr>
        <th><label>Page Size: </label></th>
        <td><span>Show</span><form:select path="pageSize" items="${listPageSize}"/> <span>email per page</span></td>
    </tr>
    <tr>
        <th><label>Spams filter: </label></th>
        <td><form:checkbox path="spamsFilter"/> <span>Enable spams filter</span></td>
    </tr>
    <tr>
        <th><label>Signature: </label></th>
        <td><form:textarea path="signature"/></td>
    </tr>
</table>
    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</body>
</html>
