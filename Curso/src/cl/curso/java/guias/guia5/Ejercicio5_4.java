package cl.curso.java.guias.guia5;
public class Ejercicio5_4 {

	public static void main(String[] args) {
	
		 int arreglo[]={21,3,6,22,50, 90,22,3};
		//int arreglo[]={1,2,6,4,5};
		boolean cambio=true;
		int contador=0;
		int aux=0;
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
		}
		
		System.out.println("\n\n     ----------------------");
		
		while(cambio){
			contador++;
			cambio=false;
			for (int i = 1; i < arreglo.length; i++) {
				if(arreglo[i-1]>arreglo[i]){
					aux=arreglo[i-1];
					arreglo[i-1]=arreglo[i];
					arreglo[i]=aux;
					cambio=true;
					imprimir(arreglo);
				}
			}
		}
		System.out.println(" " + contador );
		
		
	}
	
	
	public static void imprimir( int arreglo[] )
	{
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
		}
		System.out.println();
	}
	

}
