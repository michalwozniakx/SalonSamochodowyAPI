<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User edit</title>
</head>
<body>
<c:url var="edit_url" value="/admin/users/edit"/>
<form:form method="post" modelAttribute="user" action="${edit_url}">
    <form:hidden path="id"/>
    Name:<form:input path="name"/>
    <form:errors path="name"/><br/>
    Surname:<form:input path="surname"/>
    <form:errors path="surname"/><br/>
    Email:<form:input path="email"/>
    <form:errors path="email"/><br/>
    Phone:<form:input path="phone"/>
    <form:errors path="phone"/><br/>
    Login:<form:input path="login"/>
    <form:errors path="login"/><br/>
    Password:<form:input path="hashedPassword"/>
    <form:errors path="hashedPassword"/><br/>
    <input type="submit" value="Save">
</form:form>

</body>
</html>

