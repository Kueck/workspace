import java.util.Scanner;

public class Ejercicio5_1 {

	public static void main(String[] args) {

		int a�o=0;
		boolean bisiesto=false;
		Scanner in = new Scanner(System.in);
		
		while(true){
		
		System.out.println("ingrese a�o a comprobar");
		a�o=in.nextInt();
		if(a�o%4==0)
		{
			bisiesto=true;
		}
		if(a�o%100==0){
			bisiesto=false;
		}
		if(a�o%400==0){
			bisiesto=true;
		}
		
		System.out.println("el a�o "+a�o+" es bisiesto:"+bisiesto);
		
		}
	}

}
