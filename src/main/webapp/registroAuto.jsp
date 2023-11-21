
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Registro usuario</title>
</head>
<body>
<h1 class="encabezado"> Registro auto</h1>
<form action="registroAuto" method="post">
    <div class="centrado">
        <label> Marca:</label>
        <input name="marca" type="text" class="campoTexto">
        <label> Rut:</label>
        <input name="patente" type="text" class="campoTexto">
        <label> Edad:</label>
        <input name="año" type="number" class="campoTexto">
        <br><br>
        <input type="submit" value="enviar" class="boton">
    </div>
</form>
</body>
</html>