package cl.curso.java.ejemplos.semaforo;

public class Verde extends EstadoSemaforo {

	@Override
	public void siguienteColor(Semaforo semaforo) {

		semaforo.setEstado(new Amarillo());
		
	}

}
