package cl.curso.java.guias.guia11_1.ejercicio2;

public class Animal implements Runnable {

	public static boolean carreraFinalilza=false;
	private String nombre;
	private int velocidad;
	private long descanso;
	private int posicion;
	
	
	public Animal(String nombre, int velocidad, long descanso, int posicion) {
		super();
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.descanso = descanso;
		this.posicion = posicion;
	}
	@Override
	public void run() {
	
		while(!Animal.carreraFinalilza){
			if(this.getPosicion()>=100){
				Animal.carreraFinalilza=true;
			}else{
				this.setPosicion(this.getPosicion()+this.getVelocidad());
				try {
		            	Thread.sleep((long) (0 + (Math.random()  * this.getDescanso()))); 
		            } catch (Exception e) {
		            	e.printStackTrace();
		            }
			}
		}
		
	}
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public long getDescanso() {
		return descanso;
	}


	public void setDescanso(long descanso) {
		this.descanso = descanso;
	}


	public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

}
