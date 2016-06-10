package cl.curso.java.guias.guia6;
import java.util.Scanner;

public class Ejercicio6_4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String isbn;
		String numIsbn;
		char dver;
		int numDver = 0;
		int totalIsbn = 0;
		int checksum = 0;
		System.out.println("ingrese el isbn de su libro(xxxxxxxxx-x)");
		isbn = in.next();

		

		// System.out.println("dver:"+dver);

		if (isbn.length() == 11 && isbn.charAt(9)=='-') {
			//System.out.println("----entro");
			numIsbn = isbn.split("-")[0];
			dver = isbn.split("-")[1].charAt(0);
			
			for (int i = 0, x = 10; i < numIsbn.length(); i++, x--) {
				
				// System.out.println(numIsbn.charAt(i));
				totalIsbn = totalIsbn + (Integer.parseInt("" + numIsbn.charAt(i)) * x);
				// System.out.println(numIsbn.charAt(i)+"*"+x+"="+Integer.parseInt(
				// ""+numIsbn.charAt(i) ) *x);

			}

			// System.out.println("total="+totalIsbn);

			checksum =(totalIsbn % 11);

			if(checksum==0){
				if(dver=='0'){
					System.out.println("isbn correcto");
				}else{
					System.out.println("isbn incorrecto");
				}
			}else{
			checksum=11-checksum;
			System.out.println("--------------------------------------");
			if (checksum == 10) {
				if (dver == 'x') {
					System.out.println("isbn correcto");
				} else {
					System.out.println("isbn incorrecto");
				}
			} else {
				numDver = Integer.parseInt("" + dver);
				if (numDver == checksum) {
					System.out.println("isbn correcto");
				} else {
					System.out.println("isbn incorrecto");
				}
			}
		}
		} else {
			System.out.println("isbn incorrecto");
		}

		in.close();
	}

}
