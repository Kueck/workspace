package cl.curso.java.abs_factory.abstract_factory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	GUIBuilder gBuilder=new GUIBuilder();
    	
    	
    	String platform=System.getProperty("os.name").toLowerCase();
    	System.out.println(platform);
    	
    	if(platform.startsWith("win")){
    		gBuilder.buildWindow(new MsWindowsWidgetFactory());
    	}
    	
    }
}
