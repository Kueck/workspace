package cl.curso.java.guias.guia8.ejercicio3;


public class Empleado {

	private int sueldoBase;
	private int pagoHorasExtra;
	private int horasExtrasRealizadas;
	
	Empleado(int sueldoBase,int pagoHorasExtra,int horasExtrasRealizadas){
		this.sueldoBase=sueldoBase;
		this.pagoHorasExtra=pagoHorasExtra;
		this.horasExtrasRealizadas=horasExtrasRealizadas;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getPagoHorasExtra() {
		return pagoHorasExtra;
	}

	public void setPagoHorasExtra(int pagoHorasExtra) {
		this.pagoHorasExtra = pagoHorasExtra;
	}

	public int getHorasExtrasRealizadas() {
		return horasExtrasRealizadas;
	}

	public void setHorasExtrasRealizadas(int horasExtrasRealizadas) {
		this.horasExtrasRealizadas = horasExtrasRealizadas;
	}
	
	public int sueldoBruto(){	
		
		return this.getSueldoBase()+(this.getHorasExtrasRealizadas()*this.getPagoHorasExtra());	
	}
	
	public int sueldoLiquido(){
	
		return (int)( this.sueldoBruto()-( this.sueldoBruto()*0.17 ) );
	}
}
