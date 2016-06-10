/**
 * 
 */
package cl.curso.java.prueba_dos.cpoblete.ejercicio2;

/**
 * @author CamiloPoblete
 *
 */
public class Curso implements Imprimible {

	private String nombre;
	private Alumno[] alumnos;

	/**
	 * Constructor por defecto
	 */
	public Curso() {
		this.nombre = "n/a";
		this.alumnos = new Alumno[0];
	}

	/**
	 * @param nombre
	 * @param alumnos
	 * Constructor con parametros
	 */
	public Curso(String nombre, Alumno[] alumnos) {
		super();
		this.nombre = nombre;
		this.alumnos = alumnos;
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
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos
	 */
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.curso.java.prueba_dos.cpoblete.ejercicio2.Imprimible#imprimir()
	 * metodo imrprimir implementado de la interfaz imprimible imprime todos los
	 * atributos del objeto por consola
	 */
	@Override
	public void imprimir() {

		System.out.println("nombre curso: " + this.getNombre());
		System.out.println("Alumnos :");
		for (int i = 0; i < this.getAlumnos().length; i++) {
			this.getAlumnos()[i].imprimir();
		}
	}

	/**
	 * @return metodo calcularPromedio retorna el promedio del curso en base al
	 *         arreglo de alumnos
	 */
	public double calcularPromedio() {
		double suma = 0;

		for (int i = 0; i < this.getAlumnos().length; i++) {
			suma = suma + this.getAlumnos()[i].getPromedio();
		}
		return (suma / this.getAlumnos().length);
	}

	/**
	 * @return metodo obtenerMejorPromedio retorna el mejor promedio entre los
	 *         alumnos del curso
	 */
	public double obtenerMejorPromedio() {

		double mejorPromedio = this.getAlumnos()[0].getPromedio();

		for (int i = 0; i < this.getAlumnos().length; i++) {
			if (this.getAlumnos()[i].getPromedio() > mejorPromedio) {
				mejorPromedio = this.getAlumnos()[i].getPromedio();
			}
		}

		return mejorPromedio;
	}

}
