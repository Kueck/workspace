package cl.curso.java.login_app;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		try {
			initialize();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private void initialize() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(116, 72, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblUsuaio = new JLabel("Usuaio");
		lblUsuaio.setBounds(131, 47, 46, 14);
		frame.getContentPane().add(lblUsuaio);

		textField_1 = new JTextField();
		textField_1.setBounds(116, 128, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(126, 103, 46, 14);
		frame.getContentPane().add(lblPassword);

		// conexion y declaracion de statement
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.0.128:3306/curso?useSSL=false",
				"alumnos", "java123");
		final PreparedStatement st = conexion.prepareStatement("select * from usuarios where " + "nombre_usuario=? AND password=?");
		
		final JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int x;
				
				try {
					st.setString(1, textField.getText());
					st.setString(2, textField_1.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				try {
					
				ResultSet rs=st.executeQuery("select * from usuarios where " + "nombre_usuario='" + textField.getText()
							+ "' AND password='" + textField_1.getText() + "'");
				
				if(rs.next()){
					JOptionPane.showMessageDialog(btnLogin.getParent(), "acceso correcto");
				}else{
					WebCamService.capture();
					JOptionPane.showMessageDialog(btnLogin, "acceso denegado");
				}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				

				

			}
		});
		btnLogin.setBounds(116, 167, 86, 23);
		frame.getContentPane().add(btnLogin);
	}
}