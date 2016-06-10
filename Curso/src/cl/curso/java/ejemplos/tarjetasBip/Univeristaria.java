package cl.curso.java.ejemplos.tarjetasBip;

import java.util.Date;

public class Univeristaria extends TNE{

	@Override
	public void recargar(int monto) {
		
		int cargaMinima=1000;
		int cargaMaxima=10000;
		if(monto>cargaMinima && monto<cargaMaxima){
			this.setSaldo(this.getSaldo()+monto);
		}else{
			System.out.println("la carga minima es :"+cargaMinima
					+"\nla carga maxima es :"+cargaMaxima);
		}
		
	}

	@Override
	public void pagar() {
		int pasaje=210;
		Date fechaActual=new Date();
		if(this.getFechaDeExpiracion().before(fechaActual)){
			pasaje=680;
		}
		if(this.getSaldo()>=0){
			this.setSaldo(this.getSaldo()-pasaje);
		}else{
			System.out.println("saldo insuficiente");
		}
		
	}

	
}
