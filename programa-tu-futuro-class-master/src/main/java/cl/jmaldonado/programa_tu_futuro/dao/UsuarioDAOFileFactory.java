/**
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.jmaldonado.programa_tu_futuro.dao;

import cl.jmaldonado.programa_tu_futuro.core.Usuario;

/**
 * @author Juan Maldonado León
 *
 */
public class UsuarioDAOFileFactory extends UsuarioDAOAbstractFactory {

	@Override
	public void guardarUsuario(Usuario usuario) {
		
		UsuarioDAOFile.guardar(usuario);
	}

	@Override
	public boolean login(Usuario usuario) {
		return UsuarioDAOFile.validar(usuario);
	}	
	

}
