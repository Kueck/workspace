import java.util.Scanner;

public class Ejercicio5_5 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int tamannoArreglos=0;
		String nombres[];
		int largoNombres[];
		
		System.out.println("ingrese la cantidad de nombres");
		tamannoArreglos=in.nextInt();
		
		nombres=new String[tamannoArreglos];
		largoNombres=new int[tamannoArreglos];
		
		
		System.out.println("el largo es:"+tamannoArreglos);
		
		for (int i = 0; i < nombres.length; i++) {
		//	System.out.println("i:"+i);
			
			nombres[i]=in.next();
			largoNombres[i]=nombres[i].length();
		}
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]+":"+largoNombres[i]+" caracteres");
			
		}
		
	}

}
