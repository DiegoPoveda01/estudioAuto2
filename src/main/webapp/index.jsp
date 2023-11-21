<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Automotora</title>
  <link rel="stylesheet" type="text/css" href="styles.css">

</head>
<body>

<h1>Automotora</h1>

<!-- Mostrar el mensaje del servlet -->
<p>${message}</p>

<!-- Botones para Agregar y Eliminar Auto -->
<form action="hello-servlet" method="get">
  <input type="hidden" name="action" value="agregarAuto">
  <button type="submit">Agregar Auto</button>
</form>

<form action="hello-servlet" method="get">
  <input type="hidden" name="action" value="eliminarAuto">
  <button type="submit">Eliminar Auto</button>
</form>

</body>
</html>
