package cl.curso.java.guias.guia8.ejercicio1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Timer extends Thread {

	private Reloj reloj;

	public Timer() {
		
	}

	
	
	public Timer(Reloj reloj) {
		super();
		this.reloj = reloj;
	}



	@Override
	public void run() {

		JFrame ventana=new JFrame();
		ventana.setVisible(true);
		ventana.setSize(50, 100);
		JLabel label =new JLabel();
		ventana.getContentPane().add(label);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			label.setText(this.getReloj().getHora()+":"+this.getReloj().getMin()+":"+this.getReloj().getSeg());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			getReloj().avanzarSegundo();
		}

	}

	Reloj getReloj() {
		return reloj;
	}

	void setReloj(Reloj r1) {
		this.reloj = r1;
	}

}

