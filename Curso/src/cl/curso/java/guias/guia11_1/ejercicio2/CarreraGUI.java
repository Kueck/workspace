package cl.curso.java.guias.guia11_1.ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CarreraGUI {

	private JFrame frame;
	private Animal tortuga;
	private Animal conejo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarreraGUI window = new CarreraGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CarreraGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		tortuga = new Animal("tortuga", 1, 2000, 0);
		conejo = new Animal("conejo", 20, 1000, 0);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTortuga = new JLabel("tortuga");
		lblTortuga.setBounds(0, 11, 46, 14);
		frame.getContentPane().add(lblTortuga);

		JLabel lblConejo = new JLabel("conejo");
		lblConejo.setBounds(0, 36, 46, 14);
		frame.getContentPane().add(lblConejo);

		JButton btnIniciarCarrera = new JButton("iniciar Carrera");
		btnIniciarCarrera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Animal.carreraFinalilza = false;
				conejo.setPosicion(0);
				tortuga.setPosicion(0);
				Thread threadConejo=new Thread(conejo);
				threadConejo.start();
				
				Thread threadTortuga=new Thread(tortuga);
				threadTortuga.start();
				Thread threadPintor = new Thread(new Runnable() {
					@Override
					public void run() {
						while (!Animal.carreraFinalilza) {
							lblConejo.setBounds(conejo.getPosicion(), 11, 46, 14);
							lblTortuga.setBounds(tortuga.getPosicion(), 36, 46, 14);
							
						}
						String x;
						int option;
						if (Animal.carreraFinalilza) {
							if (conejo.getPosicion() >= 100) {
								x = conejo.getNombre();
								option = JOptionPane.showConfirmDialog(lblConejo.getParent(),
										"carrera finalinzada\nganador:" + x + "\n�desea reiniciar?",
										"carrera finalizada", JOptionPane.YES_NO_OPTION);
							} else {
								x = tortuga.getNombre();
								option = JOptionPane.showConfirmDialog(lblConejo.getParent(),
										"carrera finalinzada\nganador:" + x + "\n�desea reiniciar?",
										"carrera finalizada", JOptionPane.YES_NO_OPTION);
							}
							if (option == 0) {
								conejo.setPosicion(0);
								tortuga.setPosicion(0);
								lblConejo.setBounds(conejo.getPosicion(), 11, 46, 14);
								lblTortuga.setBounds(tortuga.getPosicion(), 36, 46, 14);
								Animal.carreraFinalilza=false;
							}
						}
					}
				});
				threadPintor.start();
			}
		});
		btnIniciarCarrera.setBounds(99, 110, 160, 23);
		frame.getContentPane().add(btnIniciarCarrera);
	}
}
