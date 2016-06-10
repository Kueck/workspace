package cl.curso.java.guias.guia10.ejercicio2;

public class EmpleadoContratado extends Empleado{

	@Override
	public int calcularSalario() {
		return this.getHorasTrabajadas()*20000;
	}

	public EmpleadoContratado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpleadoContratado(String nombre, int horasTrabajas) {
		super(nombre, horasTrabajas);
		// TODO Auto-generated constructor stub
	}
	
	

}
