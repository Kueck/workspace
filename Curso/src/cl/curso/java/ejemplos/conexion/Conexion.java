package cl.curso.java.ejemplos.conexion;

public class Conexion {

	private EstadoConexion estado;
	
	public Conexion(EstadoConexion estado) {
		super();
		this.estado = estado;
	}

	EstadoConexion getEstado() {
		return estado;
	}

	void setEstado(EstadoConexion estado) {
		this.estado = estado;
	}
	
	public void abrir(){
		this.getEstado().abrir(this);
	}
	
	public void cerrar(){
		this.getEstado().cerrar(this);
	}
	
}
