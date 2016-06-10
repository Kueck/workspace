package cl.curso.java.guias.guia6;
import java.util.Scanner;

public class Ejercicio6_5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String rut;
		String subrut;
		String dver;
		int multiplicador;
		int suma = 0;
		int checknum;
		int opcion = 0;

		while (true) {
			System.out.println("(1)verificar rut" + "\n(2)Salir" + "\n\nIngrese una opcion");
			opcion = in.nextInt();
			switch (opcion) {
			case 1:

				System.out.println("ingrese su rut (xxxxxxxx-x)");
				rut = in.next();

				if (rut.length() <= 10 && rut.contains("-") && rut.length() >= 3) {
					subrut = rut.split("-")[0];
					dver = rut.split("-")[1].toUpperCase();

					multiplicador = 2;
					for (int i = subrut.length() - 1; i >= 0; i--) {
						suma = suma + (Integer.parseInt("" + subrut.charAt(i)) * multiplicador);
						if (multiplicador == 7) {
							multiplicador = 1;
						}
						multiplicador++;

					}
					System.out.println();
					checknum = 11 - (suma % 11);

					if (checknum == 11 && dver.equals("0")) {
						System.out.println("rut correcto\n");
					} else {
						if (checknum == 10 && dver.equals("K")) {
							System.out.println("rut correcto\n");
						} else {
							if (checknum == Integer.parseInt(dver)) {
								System.out.println("rut correcto\n");
							} else {
								System.out.println("rut incorrecto\n");
							}
						}
					}
				} else {
					System.out.println("formato incorrecto");
				}

				break;
			case 2:
				in.close();
				System.exit(0);
				break;

			default:
				System.out.println("ingrese una opcion valida\n");
				break;
			}

		}

	}

}
