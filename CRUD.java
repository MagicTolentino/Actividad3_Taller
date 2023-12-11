package Interfaz;

import java.util.List;

import modelo.Proveedor;

public interface CRUD {
	
	public List<?> listar();
	public Proveedor list(int id);
	public boolean add(Proveedor pr);
	public boolean edit(Proveedor pr);
	public boolean eliminar(int id);

}
