<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Iniciar Sesión</title>
</head>
<body>

	<form action="Servlet" method="post">
		
		<h3> Iniciar Sesión</h3><br>
		<h2>Ingresa tu nombre de usuario</h2>
		
		Nombre: <br>
		<input type="text" name="Nombre" value=""><br>
		
		<h2> Ingresa tu contraseña</h2>
		
		<input type ="text" name="Contraseña" value=""><br>
		
		<input type="submit" value="Accesar">
		
	</form>

</body>
</html>