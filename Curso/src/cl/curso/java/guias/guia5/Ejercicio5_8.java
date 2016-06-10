package cl.curso.java.guias.guia5;
import java.util.Scanner;

public class Ejercicio5_8 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int costoPorGramo=0;
		int zona=0;
		float peso=0;
		int costo=0;
		boolean opcioncorrecta=false;
		String nombreZona[]={"America del norte","America Central","America del Sur","Europa","Asia"};
		while(!opcioncorrecta){
			System.out.println("ingrese area de envio");
			System.out.println("(1)America del norte "
					+ "\n(2)America Central"
					+ "\n(3)America del sur"
					+ "\n(4)Europa"
					+ "\n(5)Asia");
			zona=in.nextInt();
			
			switch (zona){	
			case 1:
				costoPorGramo=11;
				opcioncorrecta=true;
				break;
			case 2:
				costoPorGramo=10;
				opcioncorrecta=true;
				break;
			case 3:
				costoPorGramo=12;
				opcioncorrecta=true;
				break;
			case 4:
				costoPorGramo=24;
				opcioncorrecta=true;
				break;
			case 5:
				costoPorGramo=27;
				opcioncorrecta=true;
				break;
			default:
				System.out.println("ingrese una opcion correcta");
				break;
			}
		}
		System.out.println("ingrese el peso del paquete");
		peso=in.nextFloat();
		
		System.out.println("\n________________________________________________________\n");
		costo=(int)(peso*costoPorGramo);
		
		System.out.println("peso del paquete:"+peso
				+"\ncosto por gramo:"+costoPorGramo
				+"\narea:"+nombreZona[zona-1]
				+"\ncosto total de envio:"+costo);
		
		
	}

}
