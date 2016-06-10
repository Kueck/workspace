package cl.curso.java.guias.guia9.ejerciciosComposicion.ejercicio3;

public class Alumno {

	private String nombre;
	private int edad;
	
	public Alumno(){
		setNombre("n/a");
		setEdad(0);
	}

	public Alumno(String nombre, int edad) {
		super();
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + getNombre() + ", edad=" + getEdad() + "]";
	}
	
	
	
}
