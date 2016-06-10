package cl.curso.java.prueba_dos.cpoblete.ejercicio2;

import org.omg.Messaging.SyncScopeHelper;

public class Programa {

	public static void main(String[] args){
	
	Alumno[] alumnos={new Alumno("camilo", 5),new Alumno("Juan",7)};
	Curso c=new Curso("java", alumnos);
	
	System.out.println(c.calcularPromedio());
	System.out.println(c.obtenerMejorPromedio());
	}
}
