package cl.curso.java.prueba_dos.cpoblete.ejercicio3;

/**
 * @author CamiloPoblete
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args){
	
	TrenRutaVerde tVerde=new TrenRutaVerde(654321,"linea 2");
	TrenRutaRoja  tRoja= new TrenRutaRoja(123456, "linea 2");
	EstacionComun eComun=new EstacionComun("lo Ovalle", "linea 2");
	EstacionRutaRoja eRoja= new EstacionRutaRoja("toesca", "linea 2");
	EstacionRutaVerde eVerde= new EstacionRutaVerde("el parron", "linea 2");
	
	
	System.out.println("--tren verde --");
	System.out.println("estacion verde:");
	System.out.println(eVerde.getNombre() +"  " +eVerde.getLinea()+ "=" +tVerde.seDetiene(eVerde));
	System.out.println("estacion comun:");
	System.out.println(eComun.getNombre() +"  " +eComun.getLinea()+ "=" +tVerde.seDetiene(eComun));
	System.out.println("estacion roja:");
	System.out.println(eRoja.getNombre() +"  " +eRoja.getLinea()+ "=" +tVerde.seDetiene(eRoja));
	
	System.out.println("\n");
	
	System.out.println("--tren rojo --");
	System.out.println("estacion verde:");
	System.out.println(eVerde.getNombre() +"  " +eVerde.getLinea()+ "=" +tRoja.seDetiene(eVerde));
	System.out.println("estacion comun:");
	System.out.println(eComun.getNombre() +"  " +eComun.getLinea()+ "=" +tRoja.seDetiene(eComun));
	System.out.println("estacion roja:");
	System.out.println(eRoja.getNombre() +"  " +eRoja.getLinea()+ "=" +tRoja.seDetiene(eRoja));
	
	
	
	
	}
}
