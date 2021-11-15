package model;

public class Usuario {
	private int codigo;
	private String nombre;
	private String apellido;
	private String usuario;
	private String clave;
	private String fechanac;
	private int tipo;
	private int estado;
	
	
	//Constructor
	public Usuario(String nombre, String apellido, String usuario, String clave, String fechanac) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.clave = clave;
		this.fechanac = fechanac;
	}
	
	//Método para hacer seguimiento a cada objeto "Usuario" que se va creando
	//a través de la consola
	
	

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario
				+ ", clave=" + clave + ", fechanac=" + fechanac + ", tipo=" + tipo + ", estado=" + estado + "]";
	}
	
	//Métodos de acceso
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getFechanac() {
		return fechanac;
	}
	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
}
