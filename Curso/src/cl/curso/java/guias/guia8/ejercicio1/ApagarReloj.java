package cl.curso.java.guias.guia8.ejercicio1;

public class ApagarReloj extends Thread {

	private Reloj reloj;
	private long milisegundos;	
	
	public ApagarReloj(){
		this.reloj=null;
		this.milisegundos=0;
	}
	
	public ApagarReloj(Reloj reloj, long milisegundos) {
		super();
		this.reloj = reloj;
		this.milisegundos = milisegundos;
	}

	@Override
	public void run() {
		try {
			sleep(this.getMilisegundos());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reloj.setEncendido(false);
		
	}

	long getMilisegundos() {
		return milisegundos;
	}

	void setMilisegundos(long milisegundos) {
		this.milisegundos = milisegundos;
	}

	Reloj getReloj() {
		return reloj;
	}

	void setReloj(Reloj reloj) {
		this.reloj = reloj;
	}
	
	
}
