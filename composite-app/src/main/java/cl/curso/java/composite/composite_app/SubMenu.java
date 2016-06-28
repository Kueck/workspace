package cl.curso.java.composite.composite_app;

import java.util.List;

public class SubMenu extends Menu {
	
	private List<Menu> menus;
	
		public SubMenu() {
			// TODO Auto-generated constructor stub
		}
		
	public SubMenu(String nombre,List<Menu> menus) {
			super(nombre);
			this.menus=menus;
			// TODO Auto-generated constructor stub
		}


	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	@Override
	public void pintarMenu(String espacio) {
		espacio= espacio+" ";
		System.out.println(this.getNombre());
		for (Menu menu : menus) {
			System.out.print(" ");
			menu.pintarMenu(espacio);			
		}
		espacio=espacio.substring(0, espacio.length()-1);
		

	}
	
	

}
