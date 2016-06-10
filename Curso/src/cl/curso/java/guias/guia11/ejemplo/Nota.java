package cl.curso.java.guias.guia11.ejemplo;

public class Nota {

	private double valorNota;
	private int porcentaje;
	
	public Nota() {
		super();
	}
	
	public Nota(double valorNota, int porcentaje) {
		super();
		this.valorNota = valorNota;
		this.porcentaje = porcentaje;
	}

	double getValorNota() {
		return valorNota;
	}
	void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}
	int getPorcentaje() {
		return porcentaje;
	}
	void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	public double calcularPromedio(Nota n1,Nota n2,Nota n3){
		
		return (n1.getValorNota()+n2.getValorNota()+n3.getValorNota())/3;
		
	}
	
}
