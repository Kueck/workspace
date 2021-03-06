package cl.curso.java.guias.guia11_1.ejercicio1;

public class DepositarDineroThread extends Thread {

	private CuentaBancaria cuenta;
	private int monto;

	public DepositarDineroThread() {
		this.cuenta = null;
	}

	public DepositarDineroThread(CuentaBancaria cuenta,int monto) {
		super();
		this.cuenta = cuenta;
		this.monto=monto;
	}

	public CuentaBancaria getCuenta() {
		return cuenta;
	}

	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public void run() {
		this.getCuenta().retirarDinero(this.getMonto());
		System.out.println("deposito completado con exito, su saldo es "+this.getCuenta().getSaldo());
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}
}
