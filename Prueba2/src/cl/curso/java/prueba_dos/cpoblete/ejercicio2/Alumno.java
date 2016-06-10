package cl.curso.java.prueba_dos.cpoblete.ejercicio2;

/**
 * @author CamiloPoblete
 *
 */
public class Alumno implements Imprimible {

	private String nombre;
	private double promedio;

	/**
	 * Constructor por defecto
	 */
	public Alumno() {

		this.nombre = "n/a";
		this.promedio = 0;

	}

	/**
	 * @param nombre
	 * @param promedio
	 * Constructor con parametros
	 */
	public Alumno(String nombre, double promedio) {
		super();
		this.nombre = nombre;
		this.promedio = promedio;
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
	public double getPromedio() {
		return promedio;
	}

	/**
	 * @param promedio
	 */
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.prueba_dos.cpoblete.ejercicio2.Imprimible#imprimir()
	 * metodo imrprimir implementado de la interfaz imprimible 
	 * imprime todos los atributos del objeto por consola
	 */
	@Override
	public void imprimir() {
		System.out.println("nombre :" + this.getNombre() + "\npromedio :" + this.getPromedio());
	}

}
