/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.jmaldonado.programa_tu_futuro.core;

/**
 * @author Juan Maldonado León
 *
 */
public class AutenticacionException extends Exception {
	
	private static final long serialVersionUID = 8387793484643377916L;

	/**
	 * @param message
	 */
	public AutenticacionException(String message) {
		super(message);
	}

	
}
