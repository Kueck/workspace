package cl.curso.java.guias.guia9.ejerciciosComposicion.ejercicio2;

public abstract class Permiso {

	private String nombre;
	private String identificador;
	private String descripcion;
	
	public Permiso(){
		this.setNombre("n/a");
		this.setIdentificador("n/a");
		this.setDescripcion("n/a");
	}

	public Permiso(String nombre, String identificador, String descripcion) {
		super();
		this.setNombre(nombre);
		this.setIdentificador(identificador);
		this.setDescripcion(descripcion);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
