package cl.jmaldonado.programa_tu_futuro.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cl.jmaldonado.programa_tu_futuro.core.Usuario;
import cl.jmaldonado.programa_tu_futuro.exceptions.DAOException;


/**
 * 
 * @author Juan Maldonado León
 *
 */
public final class UsuarioDAO {

	/**
	 * 
	 */
	private UsuarioDAO(){
		throw new UnsupportedOperationException();
	}
	
	public static boolean validar(Usuario usuario){
		try {
			Conexion con = Conexion.getInstancia();
			PreparedStatement st = con.getConnection().prepareStatement(
					"select * from usuarios where "+
					"nombre_usuario =?  AND "+  
					"password = ?;");
			st.setString(1,  usuario.getNombreUsuario() );
			st.setString(2,  usuario.getPassword() );
			ResultSet rs = st.executeQuery();
			return rs.next();
		} catch (Exception e) {
			throw new DAOException("Ocurrio un error al validar usuario", e);
		}
		
	}
	
	
	public static void aumentarIntentos(Usuario usuario) throws SQLException {
		//Aumentar intentos fallidos en base de datos
	}

	public static void guardar(Usuario usuario) {
		try {
			Conexion con = Conexion.getInstancia();
			PreparedStatement st = con.getConnection().prepareStatement(
					"INSERT INTO usuarios "+
					"(nombre_usuario, password)"+  
					" VALUES (?, ?);");
			st.setString(1,  usuario.getNombreUsuario() );
			st.setString(2,  usuario.getPassword() );
			st.executeUpdate();
		} catch (Exception e) {
			throw new DAOException("Ocurrio un error al guardar el usuario", e);
		}
	}

}
