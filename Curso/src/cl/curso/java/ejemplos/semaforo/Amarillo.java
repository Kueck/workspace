package cl.curso.java.ejemplos.semaforo;

public class Amarillo extends EstadoSemaforo {

	@Override
	public void siguienteColor(Semaforo semaforo) {

		semaforo.setEstado(new Rojo());
		
	}

}
