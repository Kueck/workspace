package cl.curso.java.guias.guia11_1.ejercicio3;

public class Bus {

	private String nombre;
	private Asiento[] asientos;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(String nombre, Asiento[] asientos) {
		super();
		this.nombre = nombre;
		this.asientos = asientos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Asiento[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[] asientos) {
		this.asientos = asientos;
	}
	
	public synchronized void reservaAsiento(int asiento){
		if(!this.getAsientos()[asiento].isReservado()){
		this.getAsientos()[asiento].setReservado(true);
		}else{
			throw new AsientoReservadoException("el asiento ("+asiento+") esta reservado");
		}
	}
}
