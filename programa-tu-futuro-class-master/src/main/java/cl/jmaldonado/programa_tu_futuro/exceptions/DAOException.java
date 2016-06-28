/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.jmaldonado.programa_tu_futuro.exceptions;

/**
 * @author Juan Maldonado León
 *
 */
public class DAOException extends RuntimeException {

	private static final long serialVersionUID = 5195862508744619230L;

	/**
	 * 
	 */
	public DAOException() {
		super();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public DAOException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 */
	public DAOException(String arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 */
	public DAOException(Throwable arg0) {
		super(arg0);
	}
	
	

}
