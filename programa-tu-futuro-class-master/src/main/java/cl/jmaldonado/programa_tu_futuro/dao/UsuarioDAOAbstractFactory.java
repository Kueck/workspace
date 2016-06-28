/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.jmaldonado.programa_tu_futuro.dao;

import cl.jmaldonado.programa_tu_futuro.core.Usuario;

/**
 * @author Juan Maldonado León
 *
 */
public abstract class UsuarioDAOAbstractFactory {
	
	

	public abstract boolean login( Usuario usuario );
	public abstract void guardarUsuario( Usuario usuario );
}
