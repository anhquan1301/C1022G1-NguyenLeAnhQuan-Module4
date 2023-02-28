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
<form:form>
    <div>
        <form:hidden path="id"/>
    </div>
    <div>
        <label for="">Languages: </label>
        <form:select path="" items=""/>
    </div>
    <div>
        <label for="">Page Size: </label>
        <span>Show</span><form:select path=""/> <span>email per page</span>
    </div>
    <div>
        <label for="">Spams filter:</label>
        <form:radiobutton path=""/> <span>Enable spams filter</span>
    </div>
    <div>
        <label for="">Signature</label>
        <form:textarea path=""/>
    </div>
</form:form>
</body>
</html>
