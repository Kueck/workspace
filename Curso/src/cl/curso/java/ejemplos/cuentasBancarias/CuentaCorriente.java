package cl.curso.java.ejemplos.cuentasBancarias;

public class CuentaCorriente extends CuentaBancaria {

	int lineaCredito;
	
	
	@Override
	public void girar(int monto) {
		if(this.getSaldo()+this.lineaCredito<monto){
			System.out.println("no le queda un saldo,ni linea de credito suficiente para girar");
		}else{
			if(this.getSaldo()<monto){
				System.out.print("ha girado $"+monto+ "con ");
				monto=monto-this.getSaldo();
				this.setSaldo(0);
				System.out.println("$"+monto+" de sobregiro");
				this.lineaCredito=this.lineaCredito-monto;
			}else{
				
			}
		}
		
		
	}
	
	
}
