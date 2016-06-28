package cl.jmaldonado.programa_tu_futuro.dao;

import cl.jmaldonado.programa_tu_futuro.core.Usuario;



/**
 * 
 * @author Juan Maldonado León
 *
 */
public class UsuarioDAOFile {

	
	/**
	 * @param usuario
	 */
	public static void guardar(Usuario usuario) {
		System.out.println( "Se almacenara el usuario en un archivo." );
	}

	public static boolean validar(Usuario usuario) {
		return true;
	}

}
