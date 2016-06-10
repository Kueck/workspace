package cl.curso.java.guias.guia11.ejercicio3;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str={"foo"};
		String functionName;
		try{
			functionName=str[10];
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.err.println("se ha salido del limite del arreglo al intentar trabajar con la posicion: "+ae.getMessage());
		}		
	}

}
