package cl.curso.java.ejemplos.tarjetasBip;

public class Basica extends TNE {

	@Override
	public void recargar(int monto) {

		int cargaMinima=400;
		if(monto>cargaMinima){
			this.setSaldo(this.getSaldo()+monto);
		}else{
			System.out.println("la carga minima es "+cargaMinima);
		}
		
	}

	@Override
	public void pagar() {
	
		
		
	}

}
