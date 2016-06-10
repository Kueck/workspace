package cl.curso.java.control_cinco.cpoblete.ejercicio2;

/**
 * @author CamiloPoblete
 *
 */
public class Departamento {

	private String nombre;
	private String descripcion;

	/**
	 * 
	 */
	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Departamento(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Departamento)
			return this.getNombre().equals(((Departamento) obj).getNombre());
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}

	
}
