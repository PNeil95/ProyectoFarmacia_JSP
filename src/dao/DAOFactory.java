package dao;

import interfaces.ProductoInterface;
import interfaces.UsuarioInterface;

//Clase que fabrica las implementaciones
public abstract class DAOFactory {
	//constantes de la BD que puedo utilizar
	public static final int MYSQL = 1;
	public static final int SQL = 2;
	public static final int Oracle = 3;
	
	//Creando acceso a las interfaces (Mediante un metodo get --> que me devolvera las implementaciones mediante la interfaz)
	public abstract ProductoInterface getProductoDAO();
	public abstract UsuarioInterface getUsuarioDAO();
	
	//Creando una instancia de la fabrica --> según la BD
	public static DAOFactory getDAOFactory(int qBD) 
	{
		switch(qBD){
			case MYSQL:
				return new MySQLDAOFactory();
			case SQL:
				return new SQLDAOFactory();
			//Otros
			default:
				return null;
		
		}
		
	}
}
