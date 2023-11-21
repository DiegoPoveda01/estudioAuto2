<%--
  Created by IntelliJ IDEA.
  User: paulo
  Date: 21-11-2023
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Eliminar Auto</title>
</head>
<body>

<h2>Eliminar Auto</h2>

<form action="eliminarAuto" method="get">
    <label for="patente">Patente del Auto:</label>
    <input type="text" id="patente" name="patente" required>
    <button type="submit">Eliminar</button>
</form>

</body>
</html>
