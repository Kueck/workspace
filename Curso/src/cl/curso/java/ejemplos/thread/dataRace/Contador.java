package cl.curso.java.ejemplos.thread.dataRace;

public class Contador {

	private int cuenta;
	
	
	
	public Contador() {
		this.cuenta=0;
	}
	
	public Contador(int cuenta) {
		super();
		this.cuenta = cuenta;
	}



	public void aumentaCuenta(){
		synchronized (this) {
			this.cuenta++;
			System.out.println(this.cuenta);	
		}
		
	}
	
	
}
