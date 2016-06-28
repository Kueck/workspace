package cl.curso.java.command_composite.command_composite_app;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    SubMenu menu= new SubMenu(new LinkedList<Menu>(), "file");
    menu.getMenus().add(new ItemMenu("Abrir",new AbrirCommand()));
    menu.getMenus().add(new ItemMenu("nulo"));
    menu.getMenus().add(new ItemMenu("project..",new Command() {
		
		public void execute() {
			System.out.println("se creara un proyecto...");
			
		}
	}));
    	
    
    }
}
