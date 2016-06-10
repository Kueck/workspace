package cl.curso.java.ejemplos.semaforo;

public class Rojo extends EstadoSemaforo {

	@Override
	public void siguienteColor(Semaforo semaforo) {

		semaforo.setEstado(new Verde());
		
	}

}
