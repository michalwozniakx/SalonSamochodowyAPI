<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User confirm</title>
</head>
<body>

<table border="1">
    <thead>
    <th>Name</th>
    <th>Surname</th>
    <th>Email</th>
    <th>Phone</th>
    <th>Login</th>
    <th>Password</th>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${user.name}"/></td>
        <td><c:out value="${user.surname}"/></td>
        <td><c:out value="${user.email}"/></td>
        <td><c:out value="${user.phone}"/></td>
        <td><c:out value="${user.login}"/></td>
        <td><c:out value="${user.hashedPassword}"/></td>
        <td>
            <a href="<c:out value="/admin/cars/add/${user.id}"/>">Wybierz model</a>
            <a href="<c:out value="/admin/cars/configuration/${user.id}"/>">Ustal konfigurację</a>
        </td>
    </tr>

    </tbody>
</table>
</body>
</html>

