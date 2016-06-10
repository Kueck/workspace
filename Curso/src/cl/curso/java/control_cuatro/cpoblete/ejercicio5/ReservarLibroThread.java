package cl.curso.java.control_cuatro.cpoblete.ejercicio5;

/**
 * @author CamiloPoblete
 *
 */
public class ReservarLibroThread extends Thread {

	private Libro libro;

	/**
	 * 
	 */
	public ReservarLibroThread() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param libro
	 */
	public ReservarLibroThread(Libro libro) {
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
	 * @see java.lang.Thread#run() metodo run ejecuta el metodo reservarLibro
	 *      del atributo libro
	 *
	 */
	@Override
	public void run() {
		this.getLibro().reservarLibro();
	}

}
