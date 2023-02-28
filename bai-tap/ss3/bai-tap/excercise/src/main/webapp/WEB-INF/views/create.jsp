<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: nlaqu
  Date: 2/28/2023
  Time: 10:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create mails</title>
</head>
<body>
<h2>Create Mails</h2>
<form:form modelAttribute="setting" action="/setting/create" method="post">
    <table>
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
