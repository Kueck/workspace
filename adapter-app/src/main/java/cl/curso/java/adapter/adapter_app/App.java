package cl.curso.java.adapter.adapter_app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Musico m=new Musico();
    	GuitarraAcustica gAcustica=new GuitarraAcustica();
    	GuitarraElectroAcustica gElectroAcustica=new GuitarraElectroAcustica();
    	gElectroAcustica.setGuitarraAcustica(gAcustica);
    	m.tocar(gElectroAcustica);
    	
    	
    }
}
