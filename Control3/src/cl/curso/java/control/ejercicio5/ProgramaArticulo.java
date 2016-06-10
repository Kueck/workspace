package cl.curso.java.control.ejercicio5;

public abstract class ProgramaArticulo {

	public static void main(String[] args) {
		
		Articulo papas=new Articulo("papas lays",1);
		System.out.println("costo base:"+papas.getCostoBase());
		System.out.println("precio al detalle:"+papas.precioAlDetalle());
		System.out.println("precio por mayor:"+papas.precioAlMayor());
	}

}
