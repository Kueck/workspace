package cl.curso.java.control_cuatro.cpoblete.ejercicio5;

/**
 * @author CamiloPoblete
 *
 */
public class Libro {
	private String nombre;
	private String editorial;
	private int cantidadLibros;
	private int cantidadLibrosPrestados;

	/**
	 * Constructor por defecto
	 */
	public Libro() {
		this.nombre = "";
		this.editorial = "";
		this.cantidadLibros = 0;
		this.cantidadLibrosPrestados = 0;
	}

	/**
	 * @param nombre
	 * @param editorial
	 * @param cantidadLibros
	 * @param cantidadLibrosPrestados
	 *            Constructor con parametros
	 */
	public Libro(String nombre, String editorial, int cantidadLibros, int cantidadLibrosPrestados) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
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
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return
	 */
	public int getCantidadLibros() {
		return cantidadLibros;
	}

	/**
	 * @param cantidadLibros
	 */
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	/**
	 * @return
	 */
	public int getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}

	/**
	 * @param cantidadLibrosPrestados
	 */
	public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	/**
	 * metodo reservarLibro reserva el libro siempre y cuando hayan libros para
	 * reservar de ser asi, aumenta el valor del atributo
	 * cantidadLibrosPrestados en 1 y muestra un mensaje por consola que indica
	 * que el proceso se ha completado con exito si no quedan libros para
	 * reservar se muestra un mensaje por consola que indica que no quedan
	 * libros para reservar
	 */
	public synchronized void reservarLibro() {
		if (this.getCantidadLibrosPrestados() < this.getCantidadLibros()) {
			this.setCantidadLibrosPrestados(this.getCantidadLibrosPrestados() + 1);
			System.out.println("Libro " + this.getNombre() + " prestado con exito");
		} else {
			System.out.println("no hay libros disponibles para reservar");
		}

	}

	/**
	 * metodo devolverLibro devuelve un libro siempre y cuando el atributo
	 * cantidadLibrosPrestados sea mayor a 0 de ser ahi envia un mensaje que
	 * indica que el proceso se ha completado con exito de lo contrario, un
	 * mensaje que indica que ya se han devuelto todos los libros
	 */
	public synchronized void devolverLibro() {
		if (this.getCantidadLibrosPrestados() > 0) {
			this.setCantidadLibrosPrestados(this.getCantidadLibrosPrestados() - 1);
			System.out.println("Libro " + this.getNombre() + " devuelto con exito");
		} else {
			System.out
					.println("nuestro sistema indica que ya posee todos los ejemplares del libro que intenta devolver");
		}
	}

}
