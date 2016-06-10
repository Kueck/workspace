package cl.curso.java.ejemplos.semaforo;

public class Semaforo {
	
	private EstadoSemaforo estado;
	
	public void cambiarEstado(){
		getEstado().siguienteColor(this);
	}

	
	
	public Semaforo(EstadoSemaforo estado) {
		super();
		this.estado = estado;
	}



	EstadoSemaforo getEstado() {
		return estado;
	}

	void setEstado(EstadoSemaforo estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
}
