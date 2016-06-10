package cl.curso.java.ejemplos.tarjetasBip;

public class Clasica extends TarjetaBip
{
	

	@Override
	public void recargar(int monto) {
		int cargaMinima=1000;
		int cargaMaxima=25000;
		if(monto>cargaMinima && monto<cargaMaxima){
			this.setSaldo(this.getSaldo()+monto);
		}else{
			System.out.println("la carga minima es :"+cargaMinima
					+"\nla carga maxima es :"+cargaMaxima);
		}
		
	}

	@Override
	public void pagar() {
		int pasaje=680;
		if(this.getSaldo()>=pasaje){
			this.setSaldo(this.getSaldo()-pasaje);
		}else{
			System.out.println("saldo insuficiente");
		}
	}

}
