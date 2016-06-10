package cl.curso.java.ejemplos.thread.dataRace;

public class Programa {

	public static void main(String[] args) {

		Contador c=new Contador();
		AumentaThread t1=new AumentaThread(c);
		AumentaThread t2=new AumentaThread(c);
		
		t1.start();
		t2.start();
	}

}
