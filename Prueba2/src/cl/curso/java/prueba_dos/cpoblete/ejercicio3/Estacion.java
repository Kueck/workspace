package cl.curso.java.prueba_dos.cpoblete.ejercicio3;

/**
 * @author CamiloPoblete
 *
 */
public abstract class Estacion {

	private String nombre;
	private String linea;
	
	/**
	 * Constructo por defecto
	 */
	public Estacion(){
		this.nombre="n/a";
		this.linea="sin linea definida";
	}

	/**
	 * @param nombre
	 * @param linea
	 * Constructor con parametros
	 */
	public Estacion(String nombre, String linea) {
		super();
		this.nombre = nombre;
		this.linea = linea;
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public String getLinea() {
		return linea;
	}

	/**
	 * @param linea
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}
	
	/**
	 * @return
	 * metodo seDetieneTrenRutaRoja
	 * retorna un valor booleano que indica si el tren debe detenerse
	 */
	public abstract boolean seDetieneTrenRutaRoja();
	/**
	 * @return
	 * metodo seDetieneTrenRutaVerde
	 * retorna un valor booleano que indica si el tren debe detenerse
	 */
	public abstract boolean seDetieneTrenRutaVerde();

}
