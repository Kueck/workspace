package cl.curso.java.guias.guia7.ejercicio1;

public class CuentaVista {

	
	private int saldo;
	
	public CuentaVista()
	{
		this.saldo=0;
	}
	
	public void abonar(int monto){
		this.saldo= this.saldo+monto;
	}
	
	public void retirarDinero(int monto){

		
		if(monto<=this.saldo){
			this.saldo=this.saldo-monto;
		}else{
			System.out.println("saldo insuficiente");
		}
	}

	
	public int getSaldo() {
		return saldo;
	}
	

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void imprimir() {
		System.out.println("saldo:" + saldo);
	}

	
}
