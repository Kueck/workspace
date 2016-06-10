package cl.curso.java.guias.guia9.ejerciciosComposicion.ejercicio3;

import java.util.Arrays;

public class Asignatura {


	private String nombre;
	private String profesorJefe;
	private Alumno[] alumnos;
	
	public Asignatura(){
		this.setNombre("n/a");
		this.setProfesorJefe("n/a");
		this.setAlumnos(new Alumno[0]);
	}

	public Asignatura(String nombre, String profesorJefe, Alumno[] alumnos) {
		super();
		this.setNombre(nombre);
		this.setProfesorJefe(profesorJefe);
		this.setAlumnos(alumnos);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesorJefe() {
		return profesorJefe;
	}

	public void setProfesorJefe(String profesorJefe) {
		this.profesorJefe = profesorJefe;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + getNombre() + ", profesorJefe=" + getProfesorJefe() + ", alumnos="
				+ Arrays.toString(getAlumnos()) + "]";
	}
	
	public void imprimir(){
		System.out.println(this.toString());	
	}
	
	
	
}
