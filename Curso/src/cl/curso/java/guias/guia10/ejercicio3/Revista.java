package cl.curso.java.guias.guia10.ejercicio3;

public class Revista implements Imprimible{

	private int numeroEdicion;
	private String editorial;
	private String nombre;
	@Override
	public void imprimir() {

		System.out.println("numero Edicion:"+this.getNumeroEdicion()+ "\nEditorial:"+this.getEditorial()
							+"\nnombre:"+this.getNombre());
		
	}
	public int getNumeroEdicion() {
		return numeroEdicion;
	}
	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
