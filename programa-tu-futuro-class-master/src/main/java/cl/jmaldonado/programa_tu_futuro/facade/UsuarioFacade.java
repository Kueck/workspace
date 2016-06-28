package cl.jmaldonado.programa_tu_futuro.facade;

import java.sql.SQLException;

import cl.jmaldonado.programa_tu_futuro.core.AutenticacionException;
import cl.jmaldonado.programa_tu_futuro.core.CuentaBloqueadaException;
import cl.jmaldonado.programa_tu_futuro.core.Usuario;
import cl.jmaldonado.programa_tu_futuro.dao.UsuarioDAO;
import cl.jmaldonado.programa_tu_futuro.dao.UsuarioDAOAbstractFactory;


public final class UsuarioFacade {
	
	private UsuarioDAOAbstractFactory dao;
	
	/**
	 * 
	 * @throws AutenticacionException
	 * @throws CuentaBloqueadaException
	 * @throws SQLException 
	 */
	public void login( Usuario usuario ) throws AutenticacionException, CuentaBloqueadaException, SQLException {
		if (!( dao.login( usuario ) )) {
			UsuarioDAO.aumentarIntentos(usuario);
			throw new AutenticacionException("Usuario y/o Pass incorrectos");
		}
	}
	
	/**
	 * 
	 * @param usuario
	 */
	public void registro( Usuario usuario ){
		dao.guardarUsuario(usuario);
	}
	

	/**
	 * @return the dao
	 */
	public UsuarioDAOAbstractFactory getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(UsuarioDAOAbstractFactory dao) {
		this.dao = dao;
	}
}
