/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.jmaldonado.programa_tu_futuro.core;

import java.util.Map;

/**
 * @author Juan Maldonado León
 *
 */
public class Configuracion {

	private Map<String, String> datos;

	public Configuracion() {
	}

	/**
	 * @return the datos
	 */
	public Map<String, String> getDatos() {
		return datos;
	}

	/**
	 * @param datos the datos to set
	 */
	public void setDatos(Map<String, String> datos) {
		this.datos = datos;
	}
}
