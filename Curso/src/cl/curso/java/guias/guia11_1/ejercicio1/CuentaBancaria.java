package cl.curso.java.guias.guia11_1.ejercicio1;

public class CuentaBancaria {

	private int saldo;
	private int numeroCuenta;

	public CuentaBancaria() {
		this.saldo = 0;
		this.numeroCuenta = -1;
	}

	public CuentaBancaria(int saldo, int numeroCuenta) {
		super();
		this.saldo = saldo;
		this.numeroCuenta = numeroCuenta;
	}

	int getNumeroCuenta() {
		return numeroCuenta;
	}

	void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	int getSaldo() {
		return saldo;
	}

	void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	
	public synchronized void depositarDinero(int monto){
		this.setSaldo(this.getSaldo()+monto);
	}
	
	public synchronized void retirarDinero(int monto){
		this.setSaldo(this.getSaldo()-monto);
	}
	
}
