/**
 * 
 */
package cl.curso.java.control_cuatro.cpoblete.ejercicio6;

/**
 * @author CamiloPoblete
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Auto a1 = new Auto("Nissan", "mk13", 2030, 1);

		try {
			a1.venderAuto();
		} catch (SinStockException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
