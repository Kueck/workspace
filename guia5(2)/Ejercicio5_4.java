public class Ejercicio5_4 {

	public static void main(String[] args) {
	
		 int arreglo[]={34,3,6,22,50};
		//int arreglo[]={1,2,6,4,5};
		boolean cambio=true;
		int aux=0;
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
		}
		
		System.out.println("\n\n     ----------------------");
		
		while(cambio){
			cambio=false;
			for (int i = 1; i < arreglo.length; i++) {
				if(arreglo[i-1]>arreglo[i]){
					aux=arreglo[i-1];
					arreglo[i-1]=arreglo[i];
					arreglo[i]=aux;
					cambio=true;
				}
			}
		}
		System.out.println(" ");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
		}
		
	}

}
