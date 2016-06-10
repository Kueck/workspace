package cl.curso.java.control_cinco.cpoblete.ejercicio2;

/**
 * @author CamiloPoblete
 *
 */
public class Persona {

	private String rut;
	private String nombre;
	private String apellido;
	private int edad;
	
	/**
	 * 
	 */
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param edad
	 */
	public Persona(String rut, String nombre, String apellido, int edad) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	/**
	 * @return
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
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
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	
}
