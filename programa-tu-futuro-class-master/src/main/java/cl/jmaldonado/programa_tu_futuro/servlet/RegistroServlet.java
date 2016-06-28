package cl.jmaldonado.programa_tu_futuro.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import cl.jmaldonado.programa_tu_futuro.core.AutenticacionException;
import cl.jmaldonado.programa_tu_futuro.core.CuentaBloqueadaException;
import cl.jmaldonado.programa_tu_futuro.core.Usuario;
import cl.jmaldonado.programa_tu_futuro.facade.UsuarioFacade;
import cl.jmaldonado.programa_tu_futuro.service.ServiceLocator;

/**
 * Servlet implementation class RegistroServlet
 */
@WebServlet("/registro")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = 
			Logger.getLogger(RegistroServlet.class);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nombres = (String)request.getParameter("nombre_usuario");
			String apellidos = (String)request.getParameter("password");
			String nombreUsuario = (String)request.getParameter("nombre_usuario");
			String email = (String)request.getParameter("nombre_usuario");
			String pass = (String)request.getParameter("password");
			String pass_repeat = (String)request.getParameter("nombre_usuario");
			
			UsuarioFacade facade = (UsuarioFacade)ServiceLocator.getInstance().getContext().getBean("usuarioFacade");
			facade.registro( new Usuario(nombreUsuario, pass, 0) );
			
			response.getWriter().print( "Registro correcto" );
		} catch (Exception e){
			response.getWriter().print( e.getMessage() );
			LOGGER.error("Ocurrio un error desconocido", e);
		}
	}

}
