package cl.curso.java.ejemplos.conexion;

public class ConexionCerrada extends EstadoConexion{

	@Override
	public void abrir(Conexion c) {
			c.setEstado(new ConexionAbierta());
				
	}

	@Override
	public void cerrar(Conexion c) {
		
		throw new ConexionCerradaException("la conexion ya esta cerrada");
		
	}

}
