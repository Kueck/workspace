package cl.curso.java.builder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    Director d=new Director(new BuilderAutoTesla());
    d.getBuilder().construir();
    
    	
    }
}
