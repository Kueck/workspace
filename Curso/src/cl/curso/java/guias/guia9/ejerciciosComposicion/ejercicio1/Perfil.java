package cl.curso.java.guias.guia9.ejerciciosComposicion.ejercicio1;

public class Perfil {

	private String nombre;
	private String descripcion;
	
	public Perfil(){
		
		this.setNombre("n/a");
		this.setDescripcion("n/a");
		
	}

	public Perfil(String nombre, String descripcion) {
		super();
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
