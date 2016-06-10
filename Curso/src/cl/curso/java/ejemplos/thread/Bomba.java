package cl.curso.java.ejemplos.thread;

public class Bomba implements Runnable{

	@Override
	public void run() {

		final String[] NUMEROS={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
		for(int i=9; i>=0;i--){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
				
			}
			System.out.println(NUMEROS[i]);		
		}
		
	}
	
	public static void main(String[] args){
		
		Thread thread = new Thread(new Bomba() );
		Thread t2=new Thread();
		thread.start();
		t2.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("BOOOM!!!");

	}

	
	
	
}
