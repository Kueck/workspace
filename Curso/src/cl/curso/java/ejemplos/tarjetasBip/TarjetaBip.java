package cl.curso.java.ejemplos.tarjetasBip;

abstract public class TarjetaBip {

	
	private int saldo;
	private int numTarjeta;
	private String color;
	
	abstract public void recargar(int monto);

	abstract public void pagar();

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
