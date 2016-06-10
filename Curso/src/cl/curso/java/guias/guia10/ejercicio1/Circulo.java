package cl.curso.java.guias.guia10.ejercicio1;

public class Circulo extends FiguraGeometrica {

	double radio;
	
	
	public Circulo(){
		super();
		this.radio=0;
	}
	
	public Circulo(String color, int cantidadLados,int radio) {
		super(color, cantidadLados);
		this.radio=radio;
	}

	@Override
	public void dibujar() {
		System.out.println(" _");
		System.out.println("(_)");
		
	}

	@Override
	public double calcularArea() {
		return Math.PI*(this.getRadio()*this.getRadio());
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	

}
