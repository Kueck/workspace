package cl.curso.java.guias.guia4;
import java.util.Scanner;

public class Ejercicio4_2 {

	public static void main(String[] args) {
		
	Scanner in=new Scanner(System.in);
	int clave=0;
	double matPrima=40000;
	double manObra=0;
	double costoProduccion=0;
	double precioDeVenta=0;
	double gastosFabricacion=0;
	System.out.println("ingrese codigo del producto:");
	clave=in.nextInt();
	if(clave==1||clave==2||clave==3||clave==4||clave==5||clave==6)
		{
		//costo mano de obra
		if(clave==3 || clave ==4){
			manObra=matPrima*0.75;
		}else{
			if(clave==1||clave==5){
				manObra=matPrima*0.8;
				
			}else{
				manObra=matPrima*0.85;
			}
		}
		
		//gastos de fabricacion
		if(clave==2||clave==5){
			gastosFabricacion=matPrima+(matPrima*0.3);
		}else{
			if(clave==3||clave==6){
				gastosFabricacion=matPrima+(matPrima*0.35);
			}else{
				gastosFabricacion=matPrima+(matPrima*0.28);
			}				
		}
		
		
		//costo de Produccion
		costoProduccion=matPrima+gastosFabricacion+manObra;
		
		//precio de venta
		precioDeVenta=costoProduccion+(costoProduccion*0.45);
		
		System.out.println("_________________________________");
		System.out.println("");
		System.out.println("la clave del producto es:"+clave);
		System.out.println("el costo de mano de obra es:"+manObra);
		System.out.println("los gastos de fabricacion son:"+gastosFabricacion);
		System.out.println("el costo de produccion es:"+costoProduccion);
		System.out.println("el prfecio final de venta es:"+Math.floor(precioDeVenta * 100) / 100);
		}else
		{
			System.out.println("la clave ingresada no existe");
		}
	
		
		
	}

}