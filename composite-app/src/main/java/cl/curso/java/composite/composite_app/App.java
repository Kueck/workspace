package cl.curso.java.composite.composite_app;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		
		ArrayList<Menu> submenu=new ArrayList<Menu>();
		submenu.add(new ItemMenu("select working set"));
		SubMenu sm1=new SubMenu("Project",new ArrayList<Menu>());
		sm1.getMenus().add(new ItemMenu("Open Project"));
		sm1.getMenus().add(new ItemMenu("Close Project"));
		sm1.getMenus().add(new LineaSeparadora());
		sm1.getMenus().add(new ItemMenu("Build all","Ctrl+B"));
		sm1.getMenus().add(new SubMenu("Build Working Set",submenu));;
		sm1.getMenus().add(new ItemMenu("Clean"));
		sm1.getMenus().add(new ItemMenu("Build Automatically"));
		sm1.getMenus().add(new LineaSeparadora());		
		sm1.getMenus().add(new ItemMenu("Generate Javadoc"));
		sm1.getMenus().add(new LineaSeparadora());
		sm1.getMenus().add(new ItemMenu("Properties"));
		
		sm1.pintarMenu("");
		
		String espacio="aaaa";
		espacio=espacio.substring(0, espacio.length()-1);
		System.out.println(espacio);
		
    	
    }
}
