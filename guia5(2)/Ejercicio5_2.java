import java.util.Scanner;

public class Ejercicio5_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int area=0;
		int costo=0;
		int total=0;
		int dias=0;
		
		System.out.println("ingrese area en la que se realizara la hospitalizacion");
		area=in.nextInt();
		
		switch (area){
		
		case 1:
			costo=150000;
			break;
			
		case 2:
			costo=120000;
			break;
			
		case 3:
			costo=200000;
			break;
			
		default:
			costo=80000;
			break;
		}		
		System.out.println("ingrese cantidad de dias que estara en hospitalizacion");
		dias=in.nextInt();
		
		total=dias*costo;
		
		System.out.println("-----------------------------");
		System.out.println("el costo por dia de hospitalizacion es:"+costo);
		System.out.println("ud estara en hospitalizacion "+dias+" dias");
		System.out.println("el costo total de la hospitalizacion es de:"+total);
	}

}
