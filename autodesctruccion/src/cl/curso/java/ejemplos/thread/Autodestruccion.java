package cl.curso.java.ejemplos.thread;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Autodestruccion implements Runnable {

	public static void main(String[] args) {

		while(true){
			
			new Thread(new Autodestruccion()).start();;
			
		}

	}

	@Override
	public void run() {
		JFrame ventana=new JFrame("AHHHHH!!");
		JLabel x=new JLabel("AHHHHH!!!!");
		ventana.getContentPane().add(x);
		ventana.setSize(50, 40);
		ventana.setVisible(true);
		while (true){
			ventana.setBounds((int)(Math.random()*600),(int)(Math.random()*600), 50, 40);
		}
		
	}

}
