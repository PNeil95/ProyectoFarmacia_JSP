package interfaces;

import model.Usuario;

public interface UsuarioInterface {

	//Definir los métodos de mantenimiento
	
	//1. Registrar un Usuario
	public int registrar(Usuario u);
	
	//2. Actualizar un Usuario
	public int actualizar(Usuario u);
}
