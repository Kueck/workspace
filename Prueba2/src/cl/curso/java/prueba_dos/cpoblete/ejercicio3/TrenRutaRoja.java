package cl.curso.java.prueba_dos.cpoblete.ejercicio3;

/**
 * @author CamiloPoblete
 *
 */
public class TrenRutaRoja extends Tren{

	
	
	
	/**
	 * Constructor por defecto
	 */
	public TrenRutaRoja() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numero
	 * @param linea
	 * Csontructor con parametros
	 */
	public TrenRutaRoja(int numero, String linea) {
		super(numero, linea);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.prueba_dos.cpoblete.ejercicio3.Tren#seDetiene(cl.curso.java.prueba_dos.cpoblete.ejercicio3.Estacion)
	 * metodo seDetiene
	 * retorna un valor de tipo booleano que indica si el tren se detuvo en la estacion que recibe
	 */
	@Override
	public boolean seDetiene(Estacion estacion) {
		
		return estacion.seDetieneTrenRutaRoja();
	}

}
