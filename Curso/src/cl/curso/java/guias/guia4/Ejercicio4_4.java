package cl.curso.java.guias.guia4;
import java.util.Scanner;

public class Ejercicio4_4 {

	public static void main(String[] args) {
		
		int antiguedad=0;
		int sueldo=0;
		double bonoAntiguedad=0;
		double bonoSueldo=0;
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("ingrese antigüedad");
		antiguedad=in.nextInt();
		System.out.println("ingre sueldo");
		sueldo=in.nextInt();
		
		//bono antigüedad
		if(antiguedad>2&&antiguedad<5)
		{
			bonoAntiguedad=sueldo*0.2;
		}else {
			if(antiguedad>=5)
			{
				bonoAntiguedad=sueldo*0.3;
			}
			
		}
		
		//bono sueldo
		if(sueldo<=1000){
			bonoSueldo=sueldo*0.25;
		}else{
			if(sueldo>1000&&sueldo<=3500)
			{
				bonoSueldo=sueldo*0.15;
			}else{
				bonoSueldo=sueldo*0.1;
			}
		}
		
		
		System.out.println("su sueldo es :"+sueldo);
		if(bonoAntiguedad>bonoSueldo)
		{
			
			System.out.println("el bono asignado es el bono de antiguedad que corresponde a:"+bonoAntiguedad);
			sueldo=(int)Math.round(sueldo+bonoAntiguedad);
		}else{
			System.out.println("el bono asignado es el bono de sueldo que corresponde a:"+bonoSueldo);
			sueldo=(int)Math.round(sueldo+bonoSueldo);
		}
		System.out.println("su sueldo final es:"+sueldo);
		
		
	}

}
