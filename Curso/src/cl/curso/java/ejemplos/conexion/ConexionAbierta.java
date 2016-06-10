package cl.curso.java.ejemplos.conexion;

public class ConexionAbierta extends EstadoConexion{

	@Override
	public void abrir(Conexion c) {

		throw new ConexionAbiertaException("la conexion ya esta abierta");
	}

	@Override
	public void cerrar(Conexion c) {

		c.setEstado(new ConexionCerrada());
	}

}
