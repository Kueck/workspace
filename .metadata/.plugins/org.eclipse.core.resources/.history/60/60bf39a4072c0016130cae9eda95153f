package cl.curso.java.guias.guia11.ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import cl.curso.java.guias.guia11.ejercicio2.AutenticacionException;
import cl.curso.java.guias.guia11.ejercicio2.CuentaBloqueada;
import cl.curso.java.guias.guia11.ejercicio2.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserGUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private cl.curso.java.guias.guia11.ejercicio2.Usuario user;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGUI window = new UserGUI();
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
	public UserGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setUser(new Usuario("camilo", "hola123"));
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInicioDeSesion = new JLabel("Inicio de Sesion");
		lblInicioDeSesion.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblInicioDeSesion.setBounds(127, 11, 165, 43);
		frame.getContentPane().add(lblInicioDeSesion);
		
		textField1 = new JTextField();
		textField1.setBounds(206, 84, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(206, 115, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(103, 87, 75, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("contrase\u00F1a");
		lblNewLabel_1.setBounds(103, 118, 93, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					user.Login(textField1.getText(), textField2.getText());
					JOptionPane.showMessageDialog(null, "logueado con exito");

				} catch (CuentaBloqueada e) {
					
					JOptionPane.showMessageDialog(null, e.getMessage(), "Exception - Cuenta Bloqueada",JOptionPane.ERROR_MESSAGE);
					
				} catch (AutenticacionException e) {
					
					JOptionPane.showMessageDialog(null, e.getMessage(), "Exception - Erro de autenticacion",JOptionPane.ERROR_MESSAGE);

				}
				
				
			}
		});
		btnLogin.setBounds(160, 175, 89, 23);
		frame.getContentPane().add(btnLogin);
	}

	cl.curso.java.guias.guia11.ejercicio2.Usuario getUser() {
		return user;
	}

	void setUser(cl.curso.java.guias.guia11.ejercicio2.Usuario user) {
		this.user = user;
	}
}
