package cl.curso.java.observer.observer_app;

import java.util.List;

public abstract class Sensor {

	private List<Observer> observers;

	public List<Observer> getObservers() {
		return observers;
	}



	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}



	public Sensor() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Sensor(List<Observer> observers) {
		super();
		this.observers = observers;
	}



	public abstract void notificar();
	
	public void añadir(Observer o) {
		
		this.getObservers().add(o);
		
	}

	public void eliminar(Observer o) {
		
		if(this.getObservers().contains(o))
			this.getObservers().remove(o);
		else
			throw new NullPointerException("observador no encontrado");
	}

}
