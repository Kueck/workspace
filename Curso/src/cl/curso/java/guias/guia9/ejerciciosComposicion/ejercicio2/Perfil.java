package cl.curso.java.guias.guia9.ejerciciosComposicion.ejercicio2;

public class Perfil {

	private String nombre;
	private String descripcion;
	private Permiso[] permisos;
	
	public Perfil(){
		this.setNombre("");
		this.setDescripcion("");
		setPermisos(new Permiso[0]);
	}

	public Perfil(String nombre, String descripcion, Permiso[] permisos) {
		super();
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setPermisos(permisos);
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

	public Permiso[] getPermisos() {
		return permisos;
	}

	public void setPermisos(Permiso[] permisos) {
		this.permisos = permisos;
	}
	
	
	
}
