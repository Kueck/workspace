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
public class Usuario {

	private String nombreUsuario;
	private String password;
	private int intentosFallidos;

	public Usuario() {
		this.nombreUsuario = "";
		this.password = "";
		this.intentosFallidos = 0;
	}

	/**
	 * @param usuario
	 * @param password
	 * @param intentosFallidos
	 */
	public Usuario(String nombreUsuario, String password, int intentosFallidos) {
		super();
		this.setNombreUsuario(nombreUsuario);
		this.password = password;
		this.intentosFallidos = intentosFallidos;
	}

	

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the intentosFallidos
	 */
	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	/**
	 * @param intentosFallidos
	 *            the intentosFallidos to set
	 */
	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	
}
