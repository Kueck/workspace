package cl.curso.java.ejemplos;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int key;
		String ayuda = "(1)Avanzar" + "\n(2)Encender" + "\n(3)Ayuda" + "\n(4)Salir"
				+ "\n(5)Mostrar informacion del auto";
		Motor motor = new Motor(1000, "diesel");  //se crea un motor con 1000 caballos de fuerza y de tipo diesel
		Auto autoToyota = new Auto("rojo", "Toyota", "AA-AA-23"); //se crea un auto rojo, marca toyota y con patente aa-aa-23
		autoToyota.setMotor(motor);//se pone el motor en el auto
		System.out.println(ayuda);

		while (true) {
			System.out.println("\n--- Ingrese una opcion ---      (3 para ayuda)");
			key = in.nextInt();
			switch (key) {
			case 1:
				System.out.println("ingrese cantidad de km a avanzar");
				autoToyota.avanzar(in.nextInt());
				break;
			case 2:
				autoToyota.encender();
				break;
			case 3:
				System.out.println(ayuda);
			case 4:
				System.out.println("bye ~");
				in.close();
				System.exit(0);			
				break;
			case 5:
				System.out.println(autoToyota);
				break;
			default:
				System.err.println("ingrese una opcion correcta");
				break;
			}
		}
	}
}
