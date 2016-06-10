package cl.curso.java.guias.guia9.ejerciciosCreacionObjetos.ejercicio3;

public class Vendedor {

	private String nombre;
	private int semanasTrabajadas;
	private int cantArticulosVendidos;
	private int valorArticuloVendido;
	
	public Vendedor(){
		this.setNombre("");
		this.setSemanasTrabajadas(0);
		this.setCantArticulosVendidos(0);
		this.setValorArticuloVendido(0);
	}
	
	public Vendedor(String nombre, int semanasTrabajadas, int cantArticulosVendidos, int valorArticuloVendido) {
		super();
		this.setNombre(nombre);
		this.setSemanasTrabajadas(semanasTrabajadas);
		this.setCantArticulosVendidos(cantArticulosVendidos);
		this.setValorArticuloVendido(valorArticuloVendido);
	}

	public int calcularComision()
	{
		return (int) ( (this.getSemanasTrabajadas()*200)+(this.getCantArticulosVendidos()*this.getValorArticuloVendido()*0.09) );
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSemanasTrabajadas() {
		return semanasTrabajadas;
	}

	public void setSemanasTrabajadas(int semanasTrabajadas) {
		this.semanasTrabajadas = semanasTrabajadas;
	}

	public int getCantArticulosVendidos() {
		return cantArticulosVendidos;
	}

	public void setCantArticulosVendidos(int cantArticulosVendidos) {
		this.cantArticulosVendidos = cantArticulosVendidos;
	}

	public int getValorArticuloVendido() {
		return valorArticuloVendido;
	}

	public void setValorArticuloVendido(int valorArticuloVendido) {
		this.valorArticuloVendido = valorArticuloVendido;
	}

}
