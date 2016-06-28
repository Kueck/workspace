package cl.curso.java.adapter.adapter_app;

public class GuitarraElectroAcustica implements Guitarra{

	
	private GuitarraAcustica guitarraAcustica;
	
	public void encender() {
		guitarraAcustica.tocar();
		
	}

	public void apagar() {
		guitarraAcustica.dejarDeTocar();
		
	}

	public GuitarraAcustica getGuitarraAcustica() {
		return guitarraAcustica;
	}

	public void setGuitarraAcustica(GuitarraAcustica guitarraAcustica) {
		this.guitarraAcustica = guitarraAcustica;
	}
	

}
