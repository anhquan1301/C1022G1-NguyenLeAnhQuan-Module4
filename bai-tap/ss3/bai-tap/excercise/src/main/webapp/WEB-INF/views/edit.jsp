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
</head>
<body>
<h2>Edit Settings</h2>
<form:form modelAttribute="setting" action="/setting/edit" method="post">
    <div>
        <form:hidden path="id"/>
    </div>
    <div>
        <label>Languages: </label>
        <form:select path="languages" items="${listLanguages}"/>
    </div>
    <div>
        <label>Page Size: </label>
        <span>Show</span><form:select path="pageSize" items="listPageSize"/> <span>email per page</span>
    </div>
    <div>
        <label>Spams filter:</label>
        <form:radiobutton path="spamsFilter"/> <span>Enable spams filter</span>
    </div>
    <div>
        <label>Signature</label>
        <form:textarea path="signature"/>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</body>
</html>
