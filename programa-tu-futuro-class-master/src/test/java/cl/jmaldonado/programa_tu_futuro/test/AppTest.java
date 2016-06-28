package cl.jmaldonado.programa_tu_futuro.test;

import cl.jmaldonado.programa_tu_futuro.core.Configuracion;
import cl.jmaldonado.programa_tu_futuro.service.ServiceLocator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		Configuracion configuracion = (Configuracion) ServiceLocator.getInstance().getContext()
				.getBean("configuracion");
		System.out.println(configuracion.getDatos().get("urlConexion"));
		System.out.println(configuracion.getDatos().get("nombreUsuario"));
		System.out.println(configuracion.getDatos().get("password"));
		assertTrue(true);
		
	}
}
