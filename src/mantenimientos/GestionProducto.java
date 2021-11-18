package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import interfaces.ProductoInterface;
import model.Producto;
import utils.MySQLConexion8;

public class GestionProducto implements ProductoInterface {

	@Override
	public int registrar(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int actualizar(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(Producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Producto> listado() {
		ArrayList<Producto> lista = null; //valor en caso de error
		// ---Plantilla a la BD----
		//Declarando e inicializando los métodos
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null; //en el caso del listado añadimos este método
		try {
			//1.Abrimos la conexion
			con = MySQLConexion8.getConexion();
			//2.Cadena de sentencia para traer la data de la "BD"
			String sql = "select * from tb_productos";
			//3.Preparamos la sentencia con la cadena
			pst = con.prepareStatement(sql);
			//4.Ejectuta la consulta y captura la data
			rs = pst.executeQuery();
			//5.Actualizara la lista con el resultado
			lista = new ArrayList<Producto>();
			
			while(rs.next()) 
			{
				Producto p = new Producto();
				p.setIdprod(rs.getString(1));
				p.setDescripcion(rs.getString(2));
				p.setStock(rs.getInt(3));
				p.setPrecio(rs.getDouble(4));
				p.setIdcategoria(rs.getInt(5));
				p.setEstado(rs.getInt(6));
				lista.add(p);
			}
			
		} catch (Exception e) {
			System.err.println("Error en el listado: "+ e.getMessage());
		}finally {
			MySQLConexion8.closeConexion(con);
		}
		return lista;
	}

	@Override
	public ArrayList<Producto> listadoxcategoria() {
		// TODO Auto-generated method stub
		return null;
	}

}
