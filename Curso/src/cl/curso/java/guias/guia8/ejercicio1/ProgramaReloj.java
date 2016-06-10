package cl.curso.java.guias.guia8.ejercicio1;

import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProgramaReloj {

	public static void main(String[] args) throws InterruptedException {
		JFrame jframe=new JFrame();
		JPanel jpanel=new JPanel();
		TextField txt1=new TextField();
		JButton btn1=new JButton();
		btn1.setText("este boton no hace nada");
		txt1.setText("0:0:0");
		//jpanel.add(txt1);
		jpanel.add(btn1);
		jframe.add(jpanel);
		jframe.setSize(100, 100);
		jframe.setVisible(true);
		jframe.setLocation(500, 500);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		Reloj r1 = new Reloj();
		while (true) { 
			Thread.sleep(1000);
			r1.imprimirHora();
			txt1.setText(r1.getHora()+":"+r1.getMin()+":"+r1.getSeg());
			
			r1.avanzarSegundo();
			if (r1.getSeg() == 60) {
				r1.setSeg(0);
				r1.setMin(r1.getMin() + 1);
			}
			if (r1.getMin() == 60) {
				r1.setMin(0);
				r1.setHora(r1.getHora() + 1);
			}
			if (r1.getHora() == 24) {
				r1.setHora(0);
			}
		}
	}

}
