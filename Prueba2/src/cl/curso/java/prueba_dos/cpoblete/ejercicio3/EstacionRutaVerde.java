package cl.curso.java.prueba_dos.cpoblete.ejercicio3;

/**
 * @author CamiloPoblete
 *
 */
public class EstacionRutaVerde extends Estacion {

	
	
	
	/**
	 * Constructor por defecto
	 */
	public EstacionRutaVerde() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param linea
	 * Constructor con parametros
	 */
	public EstacionRutaVerde(String nombre, String linea) {
		super(nombre, linea);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.prueba_dos.cpoblete.ejercicio3.Estacion#seDetieneTrenRutaRoja()
	 */
	@Override
	public boolean seDetieneTrenRutaRoja() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.prueba_dos.cpoblete.ejercicio3.Estacion#seDetieneTrenRutaVerde()
	 */
	@Override
	public boolean seDetieneTrenRutaVerde() {
		// TODO Auto-generated method stub
		return true;
	}

}
