package cl.curso.java.guias.guia10.ejercicio1;

public class Cuadrado extends FiguraGeometrica {

	private int lado;
	
	public Cuadrado(){
		super();
		this.lado=0;
	}
	
	public Cuadrado(String color, int cantidadLados,int lado) {
		super(color, cantidadLados);
		this.lado=lado;
	}

	@Override
	public void dibujar() {
		System.out.println("__");
		System.out.println("|_|");
	}

	@Override
	public double calcularArea() {
		return this.getLado()*this.getLado();
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	

}
