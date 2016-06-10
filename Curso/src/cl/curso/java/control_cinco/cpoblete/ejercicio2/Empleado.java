package cl.curso.java.control_cinco.cpoblete.ejercicio2;

/**
 * @author CamiloPoblete
 *
 */
public class Empleado extends Persona {

	private Departamento departamento;
	private int salario;

	
	/**
	 * 
	 */
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param rut
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param departamento
	 * @param salario
	 */
	public Empleado(String rut, String nombre, String apellido, int edad,Departamento departamento, int salario) {
		super(rut, nombre, apellido, edad);
		this.departamento = departamento;
		this.salario = salario;
		}
	
	/**
	 * @return
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Empleado)
			return this.getRut().equals(((Empleado) obj).getRut());
		return false;
	}

	/* (non-Javadoc)
	 * @see cl.curso.java.control_cinco.cpoblete.ejercicio2.Persona#toString()
	 */
	@Override
	public String toString() {
		return "Empleado {\ndepartamento=" + departamento + ", \nsalario=" + salario + "\n "+super.toString()+"\n}";
	}
	
	

}
