package cl.curso.java.guias.guia6;
import java.util.Scanner;

public class Ejercicio6_3 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		float aprobados[];
		float reprobados[];
		float notas[];
		int cantAprobados=0;
		int cantReprobados=0;
		int x=0;
		System.out.println("ingrese cantidad de alumnos");
		notas=new float[in.nextInt()];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("ingrese nota");
			notas[i]=in.nextFloat();
			if(notas[i]>3.9){
				cantAprobados++;
			}else{
				cantReprobados++;
			}
		}
		
		aprobados=new float[cantAprobados];
		reprobados=new float[cantReprobados];
		System.out.println();
		//kueck
		
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]<4)
			{
				reprobados[x]=notas[i];
				x++;
			}
		}
		
		x=0;
		
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]>=4){
			aprobados[x]=notas[i];
			x++;
			}
		}
		
		System.out.println("aprobados:"+cantAprobados+"["+aprobados.length+"]");
		System.out.print("notas:");
		for (int i = 0; i < aprobados.length; i++) {
			System.out.print(" "+aprobados[i]);
		}
		
		System.out.println();
		
		System.out.println("reprobados:"+cantReprobados+"["+reprobados.length+"]");
		System.out.print("notas:");
		for (int i = 0; i < reprobados.length; i++) {
			System.out.print(" "+reprobados[i]);
		}
		in.close();
	}

}
