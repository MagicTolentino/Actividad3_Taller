<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import= "dao.daoProveedor" %>
    <%@ page import= "modelo.Proveedor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar</title>
</head>
<body>

	<div>
	
	<%
		daoProveedor dao = new daoProveedor();
		int id = Integer.parseInt((String)request.getAttribute("idP"));
		Proveedor p = (Proveedor)dao.list(id);
		
	%>
	
		<h1>Editar Proveedor</h1>
		<form action="Controlador">
			Empresa:<br>
			<input type="text" name="empresa" value="<%= p.getEmpresa() %>"><br>
			Contacto:<br>
			<input type="text" name="contacto" value="<%= p.getContacto() %>"><br>
			Telefono:<br>
			<input type="text" name="telefono" value="<%= p.getTelefono() %>"><br>
			Correo:<br>
			<input type="text" name="correo" value="<%= p.getCorreo() %>"><br>
			Direccion:<br>
			<input type="text" name="direccion" value="<%= p.getDireccion() %>"><br>
			Zona:<br>
			<input type="text" name="zona" value=""><br>
			
			<input type="hidden" name="IdP" value="<%= id %>">
			
			<input type="submit" name="accion" value="Actualizar"> <br>
			<a href="Controlador?accion=listar">Regresar</a>
			
		</form>
	</div>

</body>
</html>