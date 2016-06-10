package cl.curso.java.guias.guia10.ejercicio1;

abstract public class FiguraGeometrica {

	private String color;
	private int cantidadLados;
	
	FiguraGeometrica(){
		this.color="";
		this.cantidadLados=0;	
	}
		
	FiguraGeometrica(String color,int cantidadLados){	
		this.color=color;
		this.cantidadLados=cantidadLados;	
	}
	
	abstract public void dibujar();
	abstract public double calcularArea();
	
}
