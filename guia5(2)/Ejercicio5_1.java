import java.util.Scanner;

public class Ejercicio5_1 {

	public static void main(String[] args) {

		int año=0;
		boolean bisiesto=false;
		Scanner in = new Scanner(System.in);
		
		while(true){
		
		System.out.println("ingrese año a comprobar");
		año=in.nextInt();
		if(año%4==0)
		{
			bisiesto=true;
		}
		if(año%100==0){
			bisiesto=false;
		}
		if(año%400==0){
			bisiesto=true;
		}
		
		System.out.println("el año "+año+" es bisiesto:"+bisiesto);
		
		}
	}

}
