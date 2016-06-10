package cl.curso.java.ejemplos.division_exception;

public class Division {

	private int dividendo;
	private int divisor;
	
	public Division()
	{
	this.dividendo=0;
	this.divisor=0;	
	}
	
	public Division(int dividendo,int divisor){
		
		this.dividendo=dividendo;
		this.divisor=divisor;
		
	}
	
	public double hacerDivision(){
		
		return dividendo/divisor;
		
	}

	public int getDividendo() {
		return dividendo;
	}

	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}
	
	
	
}
