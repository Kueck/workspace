import java.util.Scanner;

public class Ejercicio5_3 {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		String dias[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		int dia=0;
		
		while(dia<1||dia>8){
		System.out.println("escriba un numero del 1 al 7 para saber su correspondiente dia de la semana");	
		dia=in.nextInt();
		}
		
		System.out.println("el numero ("+dia+") corresponde al dia "+dias[dia-1]);
	
		
	}

}
