<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Dostępne modele</title>
</head>
<body>
<c:url var="add_url" value="/admin/cars/add"/>
<form:form method="post" modelAttribute="car" action="${add_url}">

    <label>Wybierz model</label>

    <form:select path="car" multiple="false">
        <form:option value="">Dostępne modele</form:option>
        <form:option value="Polo" items="${car}">Polo</form:option>
        <form:option value="Golf" items="${car}">Golf</form:option>
        <form:option value="Passat" items="${car}">Passat</form:option>
        <form:option value="Caddy" items="${car}">Caddy</form:option>
        <form:option value="Touran" items="${car}">Touran</form:option>
        <form:option value="Tiguan" items="${car}">Tiguan</form:option>
        <form:option value="Transporter" items="${car}">Transporter</form:option>
    </form:select>

<input type="submit" value="Potwierdź">
</form:form>

</body>
</html>
