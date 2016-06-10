package cl.curso.java.guias.guia10.ejercicio2;

public class EmpleadoComision extends Empleado {

	
	private int canditadDeVentas;
	private int sueldoBase;
	
	@Override
	public int calcularSalario() {
			return (this.getCanditadDeVentas()*9000)+this.getSueldoBase();
	}

	public EmpleadoComision() {
		super();
		this.canditadDeVentas=0;
		this.sueldoBase=0;
	}

	public EmpleadoComision(String nombre, int horasTrabajas, int cantidadDeVentas,int sueldoBase) {
		super(nombre, horasTrabajas);
		this.canditadDeVentas=cantidadDeVentas;
		this.sueldoBase=sueldoBase;
	}

	public int getCanditadDeVentas() {
		return canditadDeVentas;
	}

	public void setCanditadDeVentas(int canditadDeVentas) {
		this.canditadDeVentas = canditadDeVentas;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	
	
}
