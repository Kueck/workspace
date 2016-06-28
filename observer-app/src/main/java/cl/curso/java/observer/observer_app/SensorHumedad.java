package cl.curso.java.observer.observer_app;

public class SensorHumedad extends Sensor {

	private int humedadRelativa;

	@Override
	public void notificar() {

		for (Observer obs : this.getObservers()) {
			obs.actualizar(this);
		}
		
	}
	
}
