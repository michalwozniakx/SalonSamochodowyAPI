<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User list</title>
</head>
<body>
<a href="<c:url value="/admin/users/add"/>">Dodaj</a>
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
    <c:forEach items="${users}" var="user">
        <tr>
            <td><c:out value="${user.name}"/></td>
            <td><c:out value="${user.surname}"/></td>
            <td><c:out value="${user.email}"/></td>
            <td><c:out value="${user.phone}"/></td>
            <td><c:out value="${user.login}"/></td>
            <td><c:out value="${user.hashedPassword}"/></td>
            <td>
                <a href="<c:out value="/admin/users/edit/${user.id}"/>">Edytuj</a>
                <a href="<c:out value="/admin/users/delete/${user.id}"/>">Usuń</a>
                <a href="<c:out value="/admin/users/confirm/${user.id}"/>">Zatwierdź</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

