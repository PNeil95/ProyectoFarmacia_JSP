package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mantenimientos.GestionUsuario;
import model.Usuario;

/**
 * Servlet implementation class RegistrarUsuarioServlet
 */
@WebServlet(name = "regusu", urlPatterns = { "/regusu" })
public class RegistrarUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Seguimiento através de la consola
		System.out.println("Ingreso al Servlet del Usuario");
		
		//Variables
		String mensaje = "";  //avisos
		String url;   		  //indica la página de salida o resultado
		
		
		//Entradas -- para capturar un dato del formulario "request.getParameter"
		String nombre = request.getParameter("txtNombre");
		String apellido = request.getParameter("txtApellido");
		String usuario = request.getParameter("txtUsuario");
		String clave = request.getParameter("txtClave");
		String fechanac = request.getParameter("txtFecha");
		
		if(!nombre.matches("[A-Za-zñÑáéíóú]+( [A-Za-zñÑáéíóú]+)*")) 
		{
			request.setAttribute("mensaje", "Nombre no válido");
			request.getRequestDispatcher("registro.jsp").forward(request, response);;
			return;
		}
		
		
		
		//Procesos  --> Registrar en la Base de Datos
		Usuario u = new Usuario( nombre, apellido, usuario, clave, fechanac);
		//a.Por eso Instancio mi mantenimiento
		GestionUsuario gu = new GestionUsuario();
		int ok = gu.registrar(u);
		
		if(ok==0){
			mensaje = "Error al registrar";
			url = "registro.jsp";
		}else {
			mensaje = "Registro OK";
			url = "login.jsp";
		}
		
		//Salida
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher(url).forward(request, response);
		
		System.out.println("Terminó el Servlet");
	}
}
