package cl.curso.java.guias.guia11.ejemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NotasGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasGUI window = new NotasGUI();
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
	public NotasGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIngresarNota = new JLabel("Ingresar nota 1");
		lblIngresarNota.setBounds(10, 22, 116, 14);
		frame.getContentPane().add(lblIngresarNota);
		
		JLabel lblIngresarNota2 = new JLabel("Ingresar nota 2");
		lblIngresarNota2.setBounds(10, 47, 84, 14);
		frame.getContentPane().add(lblIngresarNota2);
		
		JLabel lblIngresarNota_1 = new JLabel("Ingresar nota 3");
		lblIngresarNota_1.setBounds(10, 72, 75, 14);
		frame.getContentPane().add(lblIngresarNota_1);
		
		textField = new JTextField();
		textField.setBounds(136, 19, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 44, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(136, 69, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(61, 171, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnCalcularPromedio = new JButton("Calcular Promedio");
		btnCalcularPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Nota nota=new Nota();
				double n1=Integer.parseInt(textField.getText());
				double n2=Integer.parseInt(textField_1.getText());
				double n3=Integer.parseInt(textField_2.getText());
				label.setText(String.valueOf(nota.calcularPromedio(new Nota(n1,33), new Nota(n2,33), new Nota(n3,33))));
				
			}
		});
		btnCalcularPromedio.setBounds(10, 111, 180, 23);
		frame.getContentPane().add(btnCalcularPromedio);
		
	}
}
