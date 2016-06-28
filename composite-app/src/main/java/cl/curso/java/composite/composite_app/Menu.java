package cl.curso.java.composite.composite_app;

public abstract class Menu {

	private String nombre;
	

	public Menu(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void pintarMenu(String espacio);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	
	
	
}
