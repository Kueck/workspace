package cl.curso.java.guias.guia10.ejercicio1;


public class Triangulo extends FiguraGeometrica {

	private int base;
	private int altura;
	
	
	public Triangulo() {
		super();
		this.altura=0;
		this.base=0;
	}

	public Triangulo(String color, int cantidadLados,int altura,int base) {
		super(color, cantidadLados);
		this.altura=altura;
		this.base=base;
	}

	@Override
	public void dibujar() {
		System.out.println(" /\\");
		System.out.println("/__\\");
	
		
	}

	@Override
	public double calcularArea() {

		return this.getAltura()*this.getBase();
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	

}
