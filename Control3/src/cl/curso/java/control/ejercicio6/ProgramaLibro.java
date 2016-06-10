package cl.curso.java.control.ejercicio6;

import java.util.Scanner;

public class ProgramaLibro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean libroCorrecto = false;
		String titulo = "";
		String autor = "";
		int cantidadDeEjemplares = 0;
		int cantidadDeEjemplaresPrestados = 0;
		int opcion = 0;
		System.out.println("ingrese Titulo del libro");
		titulo = in.nextLine();
		System.out.println("ingrese Autor");
		autor = in.nextLine();
		System.out.println("ingrese cantidad de ejemplares");
		cantidadDeEjemplares = in.nextInt();
		System.out.println("ingrese cantidad de ejemplares prestados");
		cantidadDeEjemplaresPrestados = in.nextInt();

		if (cantidadDeEjemplaresPrestados <= cantidadDeEjemplares) {
			libroCorrecto = true;
		} else {
			System.out.println("la cantidad de ejemplares prestado no puede ser mayor a la cantidad de ejemplares, reinicie el programa");
		}

		if (libroCorrecto) {
			Libro l1 = new Libro(titulo, autor, cantidadDeEjemplares, cantidadDeEjemplaresPrestados);

			while (true) {
				System.out.println("ingrese una opcion" + "\n1 : prestar libro" + "\n2 : devolver libro"
						+ "\n3 : informacion del libro" + "\n4 : salir");
				opcion = in.nextInt();

				switch (opcion) {
				case 1:

					l1.prestarLibro();
					if (l1.getCantidadEjemplaresPrestados() == l1.getCantidadEjemplaresPrestados() + 1) {
						System.out.println("libro prestado con exito");
					}
					break;
				case 2:
					l1.devolverLibro();
					if (l1.getCantidadEjemplaresPrestados() == l1.getCantidadEjemplaresPrestados() - 1) {
						System.out.println("libro prestado con exito");
					}
					break;
				case 3:
					l1.imprimir();
					break;
				case 4:
					System.out.println(" bye bye");
					System.exit(0);
					break;

				default:
					System.out.println("la opcion ingresada no es correcta");
					break;
				}
			}
		}
	}

}
