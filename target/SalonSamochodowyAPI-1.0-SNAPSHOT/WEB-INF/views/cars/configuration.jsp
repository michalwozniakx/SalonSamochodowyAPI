<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Konfiguracja</title>
</head>
<body>
<c:url var="add_url" value="/admin/cars/configuration"/>
<form:form method="post" modelAttribute="configuration" action="${add_url}">

    <label>Wybierz kolor</label>
    <form:select path="color" multiple="false">
        <form:option value="">Dostępne kolory</form:option>
        <form:option value="czarny" items="${configuration}">czarny</form:option>
        <form:option value="zielony" items="${configuration}">zielony</form:option>
        <form:option value="czerwony" items="${configuration}">czerwony</form:option>
        <form:option value="niebieski" items="${configuration}">niebieski</form:option>
    </form:select>

    <label>Wybierz silnik</label>
    <form:select path="engine" multiple="false">
        <form:option value="">Dostępne silniki</form:option>
        <form:option value="1.4tsi" items="${configuration}">1.4tsi</form:option>
        <form:option value="2.0tsi" items="${configuration}">2.0tsi</form:option>
        <form:option value="1.6tdi" items="${configuration}">1.6tdi</form:option>
        <form:option value="2.0tdi" items="${configuration}">2.0tdi</form:option>
    </form:select>

    <label>Skrzynia biegów</label>
    <form:select path="gearbox" multiple="false">
        <form:option value="">Rodzaje skrzyni biegów</form:option>
        <form:option value="automatyczna" items="${configuration}">automatyczna</form:option>
        <form:option value="manualna" items="${configuration}">manualna</form:option>
    </form:select>

    <label>Klimatyzacja</label>
    <form:select path="airConditioning" multiple="false">
        <form:option value="">Rodzaje klimatyzacji</form:option>
        <form:option value="manualna" items="${configuration}">manualna</form:option>
        <form:option value="climatronic" items="${configuration}">climatronic</form:option>
    </form:select>

    <label>Siedzenia</label>
    <form:select path="seats" multiple="false">
        <form:option value="">Dostępne opcje</form:option>
        <form:option value="materiałowe" items="${configuration}">materiałowe</form:option>
        <form:option value="welurowe" items="${configuration}">welurowe</form:option>
        <form:option value="alcantara" items="${configuration}">alcantara</form:option>
        <form:option value="skorzane" items="${configuration}">skorzane</form:option>
    </form:select>

    <input type="submit" value="Potwierdź">
</form:form>

</body>
</html>
