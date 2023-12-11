<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import= "dao.daoProveedor" %>
        <%@ page import= "modelo.Proveedor" %>
        <%@ page import= "java.util.ArrayList" %>
        <%@ page import= "java.util.List" %>
        <%@ page import= "java.util.Iterator" %>
        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar</title>
</head>
<body>

	<div>
		<h1>Proveedores</h1>
		<a href="Controlador?accion=add">Agregar Nuevo</a>
		<table border="1">
		
		<thead>
		<tr>
			<th>ID</th>
			<th>Empresa</th>
			<th>Contacto</th>
			<th>Correo</th>
			<th>Telefono</th>
			<th>Direccion</th>
			<th>Zona</th>
			<th>Acciones</th>
		</tr>
		</thead>
		<% 
		
			daoProveedor dao = new daoProveedor(); 
			List<Proveedor>list = dao.listar();
			Iterator <Proveedor>iter=list.iterator();
			Proveedor p= null;
			while(iter.hasNext()){
				p = iter.next();	
		%>
		<tbody>
			<tr>
				<td><%= p.getIdP() %></td>
				<td><%= p.getEmpresa() %></td>
				<td><%= p.getContacto() %></td>
				<td><%= p.getTelefono() %></td>
				<td><%= p.getCorreo() %></td>
				<td><%= p.getDireccion() %></td>
				<td><%= p.getZona() %></td>
				<td>
					<a href="Controlador?accion=editar&IdP=<%= p.getIdP() %>">Editar</a>
					<a>Remover</a>
				</td>
			</tr>
			<% }%>
		</tbody>
		</table>
	</div>

</body>
</html>