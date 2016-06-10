package cl.curso.java.guias.guia7.ejercicio1;

import java.util.Scanner;

public class CuentaVistaTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CuentaVista c1 = new CuentaVista();
		int opcion = 0;
		int monto = 0;
		while (true) {

			System.out.println(
					"(1) Abonar dinero" + "\n(2) Retirar dinero" + "\n(3) Informacion de la cuenta" + "\n(4) Salir");
			System.out.println("ingrese una opcion");
			opcion = in.nextInt();
			switch (opcion) {
				case 1: {
					System.out.println("ingrese un monto");
					monto = in.nextInt();
					c1.abonar(monto);
					break;
				}
				case 2: {
					System.out.println("ingrese un monto");
					monto = in.nextInt();
					c1.retirarDinero(monto);
					break;
				}
				case 3: {
					System.out.println("\n");
					c1.imprimir();
					break;
				}
				case 4: {
					System.out.println(0);
					break;
				}
				default: {
					System.out.println("ingrese una opcion valida");
					break;
				}
			}

			System.out.println("___________________________________\n\n\n");
		}
	}

}
