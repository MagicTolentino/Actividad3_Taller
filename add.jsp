<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Añadir Proveedor</title>
</head>
<body>
	<div>
	
		<h1>Agregar Proveedor</h1>
		<form action="Controlador">
			Empresa:<br>
			<input type="text" name="empresa"><br>
			Contacto:<br>
			<input type="text" name="contacto"><br>
			Telefono:<br>
			<input type="text" name="telefono"><br>
			Correo:<br>
			<input type="text" name="correo"><br>
			Direccion:<br>
			<input type="text" name="direccion"><br>
			Zona:<br>
			<input type="text" name="zona"><br>
			
			<input type="submit" name="accion" value="Agregar"> <br>
			<a href="Controlador?accion=listar">Regresar</a>
			
		</form>
	</div>
</body>
</html>