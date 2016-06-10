package cl.curso.java.ejemplos.cuentasBancarias;

public class CuentaBancaria {

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	private int saldo;
	private int numeroCuenta;
	
	public void girar(int monto){
		
	}
}
