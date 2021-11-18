package interfaces;

import java.util.ArrayList;

import model.Producto;

public interface ProductoInterface {
	//métodos registrar, eliminar, actualizar
	public int registrar (Producto p);
	public int actualizar (Producto p);
	public int eliminar (Producto p);
	public Producto buscar (String codigo);
	
	//listado de productos
	public ArrayList<Producto> listado();
	
	//listado de producto por categoria
	public ArrayList<Producto> listadoxcategoria();
}
