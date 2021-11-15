package mantenimientos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import interfaces.UsuarioInterface;
import model.Usuario;
import utils.MySQLConexion8;

public class GestionUsuario implements UsuarioInterface{

	@Override
	public int registrar(Usuario u) {
		//int rs=0; En caso de erro el valor que retorna sera "0"
		//Plantilla en BD --> API JDBC --> java.sql
		int rs=0;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = MySQLConexion8.getConexion();
			//Creando nuestra cadena
			String sql = "insert into tb_usuarios values (null,?,?,?,?,?,default,default)";
			pst = con.prepareStatement(sql);
			pst.setString(1, u.getNombre());
			pst.setString(2, u.getApellido());
			pst.setString(3, u.getUsuario());
			pst.setString(4, u.getClave());
			pst.setString(5, u.getFechanac());
			
			rs = pst.executeUpdate();
		} catch (Exception e) {
			System.err.println("Error al registrar Usuario: "+ e.getMessage());
		}finally {
			MySQLConexion8.closeConexion(con);
		}
		return rs;
	}

	@Override
	public int actualizar(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

}
