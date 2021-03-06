package cl.curso.java.guias.guia11_1.ejercicio3;

public class ReservarAsiento extends Thread {

	private int asiento;
	private Bus bus;
	
	public ReservarAsiento() {

	this.asiento=-1;
	this.bus=null;
		
	}
	
	public ReservarAsiento(Bus bus,int asiento) {
		
		this.bus=bus;
		this.asiento=asiento;
		
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	@Override
	public void run() {
		try {
			this.getBus().reservaAsiento(this.getAsiento()-1);
			System.out.println("asiento reservado con exito");
		} catch (AsientoReservadoException e) {
			System.out.println("el asiento "+this.getAsiento()+" esta reservado");
		}
	}
	
}

