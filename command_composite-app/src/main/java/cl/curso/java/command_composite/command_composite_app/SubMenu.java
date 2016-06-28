package cl.curso.java.command_composite.command_composite_app;

import java.util.List;

public class SubMenu extends Menu {

	
	private List<Menu> menus;
	
	public SubMenu(List<Menu>menus ,String nombre,Command c) {
		super(nombre,c);
		this.menus=menus;
	}
	
	

	public SubMenu(List<Menu>menus ,String nombre) {
		super(nombre);
		this.menus=menus;
	}



	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	
	

	
	
	
}
