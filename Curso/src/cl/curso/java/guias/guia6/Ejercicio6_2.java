package cl.curso.java.guias.guia6;
import java.util.Scanner;

public class Ejercicio6_2 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int billetes1k=0;
		int monedas500=0;
		int monedas100=0;
		int monedas50=0;
		int total=0;
		System.out.println("ingrese cantidad de billetes de 1000");
		billetes1k=in.nextInt();
		for (int i = 0; i < billetes1k; i++) {
			total=total+1000;
		}
		
		System.out.println("ingrese cantidad de monedas de 500");
		monedas500=in.nextInt();
		for (int i = 0; i < monedas500; i++) {
			total=total+500;
		}
		
		System.out.println("ingrese cantidad de monedas de 100");
		monedas100=in.nextInt();
		for (int i = 0; i < monedas100; i++) {
			total=total+100;
		}
		
		System.out.println("ingrese cantidad de monedas de 50");
		monedas50=in.nextInt();
		for (int i = 0; i < monedas50; i++) {
			total=total+50;
		}
		
		System.out.println("billetes de mil:"+billetes1k+"("+billetes1k*1000+")");
		System.out.println("monedas de 500:"+monedas500+"("+monedas500*500+")");
		System.out.println("monedas de 100:"+monedas100+"("+monedas100*100+")");
		System.out.println("monedas de 50:"+monedas50+"("+monedas50*50+")");
		System.out.println("\ntotal:"+total);
		
		in.close();
		
	}

}
