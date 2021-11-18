package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mantenimientos.GestionProducto;
import model.Producto;


/**
 * Servlet implementation class ProductoServlet
 */
@WebServlet(name = "crudprod", urlPatterns = { "/crudprod" })
public class ProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entro al Servlet del Producto...");
		//Voy a leer la opcion ingresada con el button
		String opc = request.getParameter("opcion");
		//segun la opcion seleccionada, hacer ...tal cosa
		switch (opc) {
		case "r": 
			registrar(request,response);
			break;
		case "a":
			actualizar(request,response);
			break;
		case "e":
			eliminar(request,response);
			break;
		case "l":
			listar(request,response);
			break;
		default:
			break;
		}
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ingreso al proceso de listado"); //1.obtener un listado de los productos en la Clase "GestionProducto" del método "listado()"
		ArrayList<Producto> lista = new GestionProducto().listado();//2.Enviar el listado al JSP como atributo
		request.setAttribute("lstProductos", lista); //3.Redirrecionar al JSP ---> cada ves que se envia request response debemos generar la extension
		request.getRequestDispatcher("/listado2.jsp").forward(request, response);
	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void actualizar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void registrar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

}
