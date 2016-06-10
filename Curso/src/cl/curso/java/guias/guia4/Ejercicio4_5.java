package cl.curso.java.guias.guia4;
import java.util.Scanner;

public class Ejercicio4_5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 1;
		int c = 0;
		int x = 0;

		System.out.println("ingrese la cantidad de valores que quiere ver de la serie fibonacci");
		x = in.nextInt();

		System.out.print("Fibonacci: 0 , 1");
		for (int i = 2; i < x; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" , " + c);
		}

	}

}
