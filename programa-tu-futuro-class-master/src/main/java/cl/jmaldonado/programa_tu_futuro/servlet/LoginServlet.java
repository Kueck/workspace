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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = 
			Logger.getLogger(LoginServlet.class);


    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String nombre = (String)request.getParameter("nombre_usuario");
			String pass = (String)request.getParameter("password");
			
			UsuarioFacade facade = (UsuarioFacade)ServiceLocator.getInstance().getContext().getBean("usuarioFacade");
//			UsuarioFacade.login( new Usuario(nombre, pass, 0) );
			facade.login(new Usuario(nombre, pass, 0) );
			response.getWriter().print( "Login correcto" );
			LOGGER.info("Inicio de sesion usuario " + nombre);
			
		} catch (AutenticacionException e) {
			response.getWriter().print( e.getMessage() );
		} catch (CuentaBloqueadaException e) {
			response.getWriter().print( e.getMessage() );
		} catch (SQLException e) {
			response.getWriter().print( e.getMessage() );
		} catch (Exception e){
			response.getWriter().print( e.getMessage() );
			LOGGER.error("Ocurrio un error desconocido", e);
		}
	}

}
