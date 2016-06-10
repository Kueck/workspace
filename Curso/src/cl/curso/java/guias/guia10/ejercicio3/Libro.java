package cl.curso.java.guias.guia10.ejercicio3;

public class Libro implements Imprimible{

	private String nombre;
	private String editorial;
	
	
	
	@Override
	public void imprimir() {

		System.out.println("nombre :"+this.getNombre()
							+"\neditorial :"+this.getEditorial());
		
	}
	public Libro(String nombre, String editorial) {
		super();
		this.nombre = nombre;
		this.editorial = editorial;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
	
	
}
