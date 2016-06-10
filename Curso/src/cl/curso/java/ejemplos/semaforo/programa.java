package cl.curso.java.ejemplos.semaforo;

public class programa {

	public static void main(String[] args) throws InterruptedException {

		Rojo rojo=new Rojo();
		Semaforo semaforo=new Semaforo(rojo);
		
		
		while(true){
		System.out.println(semaforo.getEstado().getClass().getSimpleName());
		Thread.sleep(1000);
		semaforo.cambiarEstado();
		}
		
		
	}

}
