package cl.curso.java.prueba_dos.cpoblete.ejercicio3;

/**
 * @author CamiloPoblete
 *
 */
public class EstacionRutaRoja extends Estacion {

	
	
	
	/**
	 * constructor por defecto
	 */
	public EstacionRutaRoja() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param linea
	 * constructor con parametros
	 */
	public EstacionRutaRoja(String nombre, String linea) {
		super(nombre, linea);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.prueba_dos.cpoblete.ejercicio3.Estacion#seDetieneTrenRutaRoja()
	 */
	@Override
	public boolean seDetieneTrenRutaRoja() {

		return true;
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.prueba_dos.cpoblete.ejercicio3.Estacion#seDetieneTrenRutaVerde()
	 */
	@Override
	public boolean seDetieneTrenRutaVerde() {
		// TODO Auto-generated method stub
		return false;
	}

}
