package cl.curso.java.ejemplos.thread.dataRace;

public class AumentaThread extends Thread {

	Contador contador;
	
	@Override
	public void run() {
		contador.aumentaCuenta();
		contador.aumentaCuenta();
		contador.aumentaCuenta();
	}

	public AumentaThread(Contador contador) {
		this.contador = contador;
	}
	
	public AumentaThread() {
	
		this.contador=null;
		
	}
	
	
}
