package cl.curso.java.guias.guia8.ejercicio2;

public class ProgramaFecha {

	public static void main(String[] args) {
	
		
		Fecha f1=new Fecha(10,1,100);
		f1.imprimirFecha();
		f1.imprimirFechaFormato();
		System.out.println("bisiesto:"+f1.isBisiesto());
		System.out.println("dia ok:"+f1.validarDia());
		System.out.println("mes ok:"+f1.validarMes());
		
		
	}

}
