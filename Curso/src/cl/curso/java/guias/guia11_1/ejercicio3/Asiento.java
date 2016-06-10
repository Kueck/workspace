package cl.curso.java.guias.guia11_1.ejercicio3;

public class Asiento {

	private boolean reservado;
	
	public Asiento() {

		this.reservado=false;
		
	}

	public Asiento(boolean reservado) {
		super();
		this.reservado = reservado;
	}
	
	public void setReservado(boolean reservado){
		this.reservado=reservado;
	}
	
	public boolean isReservado(){
		return this.reservado;
	}
	
}
