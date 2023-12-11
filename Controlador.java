package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.daoProveedor;
import modelo.Proveedor;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

    	String listar="listar.jsp";
    	String add= "add.jsp";
    	String edit= "edit.jsp";
    	Proveedor p=new Proveedor();
    	daoProveedor dao=new daoProveedor();
    	int id;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String acceso = "";
		String action = request.getParameter("accion");
		
		if(action.equalsIgnoreCase("listar")) {
			acceso=listar;
			
		}else if(action.equalsIgnoreCase("add")) {
			acceso=add;
		}else if(action.equalsIgnoreCase("Agregar")) {
			String empresa =request.getParameter("empresa");
			String contacto =request.getParameter("contacto");
			String telefono =request.getParameter("telefono");
			String correo =request.getParameter("correo");
			String direccion =request.getParameter("direccion");
			String zona =request.getParameter("zona");
			
			p.setEmpresa(empresa);
			p.setContacto(contacto);
			p.setTelefono(telefono);
			p.setCorreo(correo);
			p.setDireccion(direccion);
			p.setZona(zona);
			dao.add(p);
			acceso=listar;
		}else if(action.equalsIgnoreCase("editar")) {
			request.setAttribute("idP", request.getParameter("IdP"));
			acceso=edit;
			
		}else if(action.equalsIgnoreCase("Actualizar")) {
			id=Integer.parseInt(request.getParameter("IdP"));
			String empresa =request.getParameter("empresa");
			String contacto =request.getParameter("contacto");
			String telefono =request.getParameter("telefono");
			String correo =request.getParameter("correo");
			String direccion =request.getParameter("direccion");
			String zona =request.getParameter("zona");
			p.setIdP(id);
			
			p.setEmpresa(empresa);
			p.setContacto(contacto);
			p.setTelefono(telefono);
			p.setCorreo(correo);
			p.setDireccion(direccion);
			p.setZona(zona);
			dao.edit(p);
			acceso=listar;
		}
		RequestDispatcher vista=request.getRequestDispatcher(acceso);
		vista.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
