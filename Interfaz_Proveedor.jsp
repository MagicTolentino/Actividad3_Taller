<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Interfaz Proveedor</title>
</head>
<body>

<table border>

	<tr> 
		<th> Empresa </th>
		<th> Contacto </th>
		<th> Teléfono </th>
		<th> Correo </th>
		<th> Dirección </th>
		<th> Zona </th>
	</tr>
	
	<tr> 
		<td> 
</table>

<div align="center">

<h1>Registro Usuario</h1>
<form action = "Servlet" method="post">

	<table style = "width: 80%">
	<tr>
	<td>U</td>
	<td><input type="text" name="usuario" /></td>
	</tr>
	<tr>
	<td>Nombre</td>
	<td><input type="text" name="nombre" /></td>
	</tr>
	<tr>
	<td>Sexo</td>
	<td><input type="text" name="sexo" /></td>
	</tr>
	<tr>
	<td>Edad</td>
	<td><input type="text" name="edad" /></td>
	</tr>
	</table>	
	<input type ="submit" value="Registrar">
</form>
</div>

</body>
</html>