/**
 * 
 */
package cl.curso.java.control_cuatro.cpoblete.ejercicio5;

/**
 * @author CamiloPoblete
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Libro l1 = new Libro("Papelucho", "zig-zag", 2, 0);

		ReservarLibroThread rlt1 = new ReservarLibroThread(l1);
		ReservarLibroThread rlt2 = new ReservarLibroThread(l1);
		ReservarLibroThread rlt3 = new ReservarLibroThread(l1);

		DevolverLibroThread dlt1 = new DevolverLibroThread(l1);
		DevolverLibroThread dlt2 = new DevolverLibroThread(l1);
		DevolverLibroThread dlt3 = new DevolverLibroThread(l1);

		rlt1.start();
		rlt2.start();
		rlt3.start();

		dlt1.start();
		dlt2.start();
		dlt3.start();

	}

}
