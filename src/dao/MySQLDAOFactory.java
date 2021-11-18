package dao;

import interfaces.ProductoInterface;
import interfaces.UsuarioInterface;
import mantenimientos.GestionProductoMySQL;
import mantenimientos.GestionUsuarioMySQL;

public class MySQLDAOFactory extends DAOFactory {

	@Override
	public ProductoInterface getProductoDAO() {
		// TODO Auto-generated method stub
		return new GestionProductoMySQL();
	}

	@Override
	public UsuarioInterface getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new GestionUsuarioMySQL();
	}

}
