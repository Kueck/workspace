package cl.curso.java.guias.guia11.ejercicio5;

import javax.swing.JOptionPane;

public class ProgramaNullPointerException {

	public static void main(String[] args) {
		int numero;
		String mensaje;
		try {
			mensaje = JOptionPane.showInputDialog("ingrese un numero");
			numero = Integer.parseInt(mensaje.trim());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "debe ingresar algo", "Error de ingreso", JOptionPane.ERROR_MESSAGE);

		} 
		catch (NumberFormatException e) {

			JOptionPane.showMessageDialog(null, "debe ingresar un numero", "Error de ingreso",
					JOptionPane.ERROR_MESSAGE);

		}

	}

}
