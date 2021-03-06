package cl.curso.java.control_cinco.cpoblete.ejercicio2;

import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @author CamiloPoblete
 *
 */
public class Programa {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Departamento d1= new Departamento("departamento 1", "descripcion departamento 1");
		Departamento d2= new Departamento("departamento 2", "descripcion departamento 2");
		Departamento d3= new Departamento("departamento 3", "descripcion departamento 3");
	
		Empleado e1=new Empleado("1-9", "nombre1", "apellido1", 20, d1, 5000);
		Empleado e2=new Empleado("1-8", "nombre2", "apellido2", 20, d2, 5000);
		Empleado e3=new Empleado("1-7", "nombre3", "apellido3", 20, d3, 5000);
	
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(e2);
		empleados.add(e1);
		empleados.add(e3);
		
		
		Empresa emp1= new Empresa("empresa ", empleados); 
		
		emp1.imprimir();
		
		System.out.println("----------------\nordenar empleados por nombre\n----------------");
		emp1.ordenarEmpleadosPorNombre();
		emp1.imprimir();
		
		System.out.println("----------------\nordenar empleados por departamento\n----------------");
		emp1.ordenarEmpleadosPorDepartamento();
		emp1.imprimir();
		
		System.out.println("\n\n\n\n\n");
		System.out.println(emp1.BuscarEmpleado("1-10"));
		
	}
	
}
