package cl.curso.java.guias.guia10.ejercicio2;

abstract public class Empleado {
	private String nombre;
	private int horasTrabajadas;
	
	public Empleado(){
		
		this.nombre="";
		this.horasTrabajadas=0;
		
	}
	
	public Empleado(String nombre, int horasTrabajas){
		this.nombre=nombre;
		this.horasTrabajadas=horasTrabajas;
	}

	abstract public int calcularSalario();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	
}
