package cl.curso.java.prueba_dos.cpoblete.ejercicio3;

/**
 * @author CamiloPoblete
 *
 */
public abstract class Tren {

	private int numero;
	private String linea;
	
	/**
	 * Constructor por defecto
	 */
	public Tren(){
		
		this.numero=0;
		this.linea="linea no definida";
		
	}

	/**
	 * @param numero
	 * @param linea
	 * Constructor con parametros
	 */
	public Tren(int numero, String linea) {
		super();
		this.numero = numero;
		this.linea = linea;
	}

	/**
	 * @return
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
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
	 * @param estacion
	 * @return
	 * metodo seDetiene
	 * retorna un valor de tipo booleano que indica si el tren se detuvo en la estacion que recibe
	 */
	public abstract boolean seDetiene(Estacion estacion);
	
	
}
