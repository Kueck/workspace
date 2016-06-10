package cl.curso.java.control_cinco.cpoblete.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author CamiloPoblete
 *
 */
public class Empresa {

	private String nombre;
	private ArrayList<Empleado> empleados;

	/**
	 * 
	 */
	public Empresa() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param empleados
	 */
	public Empresa(String nombre, ArrayList<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.empleados = empleados;
	}

	/**
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return
	 */
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados
	 */
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	/**
	 *  metodo ordenarEmpleadosPorNombre()
	 *  no retorna nada
	 *  ordena la lista de empleados en base a su atributo String "nombre"
	 */
	public void ordenarEmpleadosPorNombre() {

		Collections.sort(this.getEmpleados(), new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});

	}

	/**
	 *  metodo ordenarEmpleadosPorDepartamento()
	 *  no retorna nada
	 *  ordena la lista de empleados en base a su atributo Departamento "departamento" (nombre del departamento)
	 */
	public void ordenarEmpleadosPorDepartamento() {

		Collections.sort(this.getEmpleados(), new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getDepartamento().getNombre().compareTo(o2.getDepartamento().getNombre());
			}
		});

	}

	/**
	 * @param rut
	 * @return
	 * metodo BuscarEmpleado(String rut)
	 * busca un empleado en base a su rut y lo retorna
	 */
	public Empleado BuscarEmpleado(String rut) {

		for (Empleado empleado : empleados) {
			if (empleado.getRut().equals(rut)) {
				return empleado;
			}
		}
		throw new EmpleadoNoEncontradoException("empleado no encontrado");
	}

	/**
	 * imprime la lista de empleados
	 */
	public void imprimir() {
		System.out.println("____________________________________");
		for (Empleado empleado : empleados) {
			System.out.println(empleado + "-\n ");
		}
		System.out.println("____________________________________.\n");
	}
}
