package cl.curso.java.prueba_dos.cpoblete.ejercicio3;

/**
 * @author CamiloPoblete
 *
 */
public class EstacionComun extends Estacion {

	
	
	
	public EstacionComun() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EstacionComun(String nombre, String linea) {
		super(nombre, linea);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.prueba_dos.cpoblete.ejercicio3.Estacion#seDetieneTrenRutaRoja()
	 */
	@Override
	public boolean seDetieneTrenRutaRoja() {
		// TODO Auto-generated method stub
		return true;
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
