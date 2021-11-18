package dao;

import interfaces.ProductoInterface;
import interfaces.UsuarioInterface;
import mantenimientos.GestionProductoSQLServer;
import mantenimientos.GestionUsuarioSQLServer;

public class SQLDAOFactory extends DAOFactory {

	@Override
	public ProductoInterface getProductoDAO() {
		// acceso a las implementaciones con SQL
		return new GestionProductoSQLServer();
	}

	@Override
	public UsuarioInterface getUsuarioDAO() {
		// acceso a las implementaciones con SQL
		return new GestionUsuarioSQLServer();
	}

}
