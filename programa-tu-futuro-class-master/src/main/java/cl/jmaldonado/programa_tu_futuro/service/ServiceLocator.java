/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.jmaldonado.programa_tu_futuro.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Juan Maldonado León
 *
 */
public class ServiceLocator {

	private static ServiceLocator _instance;
	private ApplicationContext context;
	
	private ServiceLocator() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public static ServiceLocator getInstance() {
		if (null == _instance){
			ApplicationContext context = new ClassPathXmlApplicationContext("programatufuturo-beans.xml");
			_instance = new ServiceLocator();
			_instance.setContext(context);
			}
		
		return _instance;
	}

}
