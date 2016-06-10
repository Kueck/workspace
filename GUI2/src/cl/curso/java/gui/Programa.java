package cl.curso.java.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Programa {

	public static void main(String[] args) throws InterruptedException {

		Hilo hilo = new Hilo();
		

		Thread thread = new Thread(new Ejecucion());

		Thread threadx = new Thread(new Runnable() {
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println(i+1);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		hilo.start();
		threadx.start();
		thread.start();

		System.out.println(" fin programa ");

	}

}
