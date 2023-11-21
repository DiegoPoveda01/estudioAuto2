
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Registro auto</title>
</head>
<body>
<h1 class="encabezado"> Registro auto</h1>
<div class="centrado">
    <p class="subtitulo">Registro exitoso</p> <br>
    <label class="campoTexto"> Auto : <c:out value="${auto.getMarca()}"></c:out> </label>
    <br>
    <label class="campoTexto">Rut : <c:out value="${auto.getPatente()}"></c:out></label>
    <a class="boton" href="/RegistroPersonas">Volver</a>
</div>

</body>
</html>