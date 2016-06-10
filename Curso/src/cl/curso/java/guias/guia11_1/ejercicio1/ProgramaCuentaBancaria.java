package cl.curso.java.guias.guia11_1.ejercicio1;

public class ProgramaCuentaBancaria {

	public static void main(String[] args) throws InterruptedException {

		CuentaBancaria cuenta= new CuentaBancaria(50000, 1234);
		
		RetirarDineroThread rtd1=new RetirarDineroThread(cuenta,500);
		RetirarDineroThread rtd2=new RetirarDineroThread(cuenta,500);
		RetirarDineroThread rtd3=new RetirarDineroThread(cuenta,500);
		DepositarDineroThread dtd1=new DepositarDineroThread(cuenta,500);
		DepositarDineroThread dtd2=new DepositarDineroThread(cuenta,500);
		DepositarDineroThread dtd3=new DepositarDineroThread(cuenta,500);
		
		rtd1.start();
		rtd2.start();
		rtd3.start();
		dtd1.start();
		dtd2.start();
		dtd3.start();
		rtd1.join();
		rtd2.join();
		rtd3.join();
		dtd1.join();
		dtd2.join();
		dtd3.join();
		System.out.println("saldo final:"+cuenta.getSaldo());
	}

}
