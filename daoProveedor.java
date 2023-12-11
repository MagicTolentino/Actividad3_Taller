package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Interfaz.CRUD;
import datos.MostrarDatos;
import modelo.Proveedor;

public class daoProveedor implements CRUD{

	MostrarDatos md = new MostrarDatos();
	Connection cn;
	PreparedStatement ps;
	ResultSet rs;
	Proveedor p = new Proveedor();
	@Override
	public List<Proveedor> listar() {
		// TODO Auto-generated method stub
		ArrayList<Proveedor>list=new ArrayList<>();
		String sql="select * from Empresa";
		try {
		cn=md.getConnection();
		ps=cn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			Proveedor p = new Proveedor();
			p.setIdP(rs.getInt("idProveedor"));
			p.setEmpresa(rs.getString("Empresa"));
			p.setContacto(rs.getString("Contacto"));
			p.setTelefono(rs.getString("Telefono"));
			p.setCorreo(rs.getString("Correo"));
			p.setDireccion(rs.getString("Direccion"));
			p.setZona(rs.getString("Zona"));
			
			list.add(p);
		
		}
		}catch(Exception e) {
			
		}
		return list;
	}

	@Override
	public Proveedor list(int id) {
		// TODO Auto-generated method stub
		String sql="select * from Empresa where idProveedor="+id;
		try {
		cn=md.getConnection();
		ps=cn.prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
		
			p.setIdP(rs.getInt("idProveedor"));
			p.setEmpresa(rs.getString("Empresa"));
			p.setContacto(rs.getString("Contacto"));
			p.setTelefono(rs.getString("Telefono"));
			p.setCorreo(rs.getString("Correo"));
			p.setDireccion(rs.getString("Direccion"));
			p.setZona(rs.getString("Zona"));
			
		
		}
		}catch(Exception e) {
			
		}
		return p;
	}

	@Override
	public boolean add(Proveedor pr) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Empresa(Empresa,Contacto,Telefono,Correo,Direccion,Zona) values ('"+pr.getEmpresa()+"','"+pr.getContacto()+"','"+pr.getTelefono()+"','"+pr.getCorreo()+"','"+pr.getDireccion()+"','"+pr.getZona()+"')";
		try {
			cn= md.getConnection();
			ps=cn.prepareStatement(sql);
			ps.executeUpdate();
		}catch (Exception e) {
			
		}
		
		return false;
	}

	@Override
	public boolean edit(Proveedor pr) {
		// TODO Auto-generated method stub
		String sql = "Update Empresa set Empresa='"+pr.getEmpresa()+"',Contacto'"+pr.getContacto()+"',Telefono'"+pr.getTelefono()+"',Correo'"+pr.getCorreo()+"',Direccion'"+pr.getDireccion()+"',Zona'"+pr.getZona()+"'where Id="+p.getIdP();
	try {
		cn= md.getConnection();
		ps=cn.prepareStatement(sql);
		ps.executeUpdate();
	}catch (Exception e) {
	
	}
	return false;
	}

	@Override
	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
