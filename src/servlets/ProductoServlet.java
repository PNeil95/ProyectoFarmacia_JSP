package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		case "r": {
			registrar(request,response);
			break;
		}
		case "a":{
			actualizar(request,response);
			break;
		}
		case "e":{
			eliminar(request,response);
			break;
		}
		case "l":{
			listar(request,response);
			break;
		}
		default:
			break;
		}
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
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
