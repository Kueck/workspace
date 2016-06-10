import java.util.Scanner;

public class Ejercicio5_6 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int largo=0;
		int arreglo[];
		int numero=0;
		System.out.println("ingrese el largo del arreglo");
		
		largo=in.nextInt();
		arreglo=new int[largo];
		
		System.out.println("ingrese el numero del cual quiere saber sus multiplos");
		
		numero=in.nextInt();
		
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i]=(i+1)*numero;
			System.out.println(i+1+"x"+numero+"="+arreglo[i]);
		}
		
		
		
		
	}

}
