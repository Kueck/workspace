package cl.curso.java.guias.guia5;
import java.beans.ConstructorProperties;
import java.util.Scanner;

public class Ejercicio5_7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		float precioPorPersona = 0;
		int cantidadDePersonas = 0;
		int costoTotal = 0;
		int kilometros= 0;
		char tipoBus=' ';
		boolean opcionIncorrecta = true;
	
		while (opcionIncorrecta) {

			System.out.println("ingrese el tipo de bus (A,B,C)");
			tipoBus = in.next().toUpperCase().charAt(0);
			
			switch (tipoBus) {
		
			case 'A':
				opcionIncorrecta=false;
				precioPorPersona = 20;
				break;
			case 'B':
				opcionIncorrecta=false;
				precioPorPersona = 25;
				break;
			case 'C':
				opcionIncorrecta=false;
				precioPorPersona = 30;
				break;
			default:
				System.out.println("ingrese un tipo de bus correcto ");
				break;
				
		}
			
		}
		
		System.out.println("ingrese cantidad de personas");
		cantidadDePersonas = in.nextInt();
		System.out.println("ingrese cantidad de kilometros");
		kilometros=in.nextInt();
		
		if(cantidadDePersonas<20){
			costoTotal=(int)(20*precioPorPersona*kilometros);
			precioPorPersona=costoTotal/cantidadDePersonas;			
		}else{
			costoTotal=(int)(cantidadDePersonas*precioPorPersona*kilometros);
			precioPorPersona=costoTotal/cantidadDePersonas;
		}
		
		System.out.println("_____________________________________________");
		System.out.println("tipo de bus:"+tipoBus+"\ncantidad de personas:"+cantidadDePersonas
				+"\ncantidad de kilometros:"+kilometros
				+"\nprecio por persona:"+(int)precioPorPersona
				+"\ncosto total del viaje:"+costoTotal);
	}

}
