package cl.curso.java.ejemplos.thread;

public class EjemploHilo2 implements Runnable {

	@Override
	public void run() {
		System.out.println("el nombre del thread es:"+Thread.currentThread().getName());	
	}
	
	public static void main(String[] args){
		
		Thread thread=new Thread( new EjemploHilo() );
		thread.start();
		
		System.out.println("metodo main; el nombre dle thread es:"+Thread.currentThread().getName());
		
	}

	
}
