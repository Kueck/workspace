/**
 * 
 */
package cl.curso.java.control_cuatro.cpoblete.ejercicio5;

/**
 * @author CamiloPoblete
 *
 */
public class DevolverLibroThread extends Thread {

	private Libro libro;

	/**
	 * Constructor por defecto
	 */
	public DevolverLibroThread() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param libro
	 *            constructor con parametros
	 */
	public DevolverLibroThread(Libro libro) {
		super();
		this.libro = libro;
	}

	/**
	 * @return
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * @param libro
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run() metodo run ejecuta el metodo devolverLibro
	 *      del atributo libro
	 *
	 */
	@Override
	public void run() {
		this.getLibro().devolverLibro();
	}

}
