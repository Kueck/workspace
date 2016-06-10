package cl.curso.java.ejemplos.division_exception;

import javax.swing.JOptionPane;

public class ProgramaDivision {

	public static void main(String[] args) {

		int dividendo=obtenerNumero("dividendo");
		int divisor=obtenerNumero("divisor");
		
		try {
			Division div = new Division(dividendo, divisor);
			JOptionPane.showMessageDialog(null, "el resultado es :" + div.hacerDivision());
		} catch (ArithmeticException aritmethic) {
			JOptionPane.showMessageDialog(null, "no puede realizar una division por 0",
					"AritmethicException - Error aritmetico", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static int obtenerNumero(String nombreDelCampo)
	{
		int numero=0;
		boolean numeroValido=false;
		do{
		try {
			numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese "+nombreDelCampo));
			numeroValido=!numeroValido;
		} catch (NumberFormatException numberFormat) {
			JOptionPane.showMessageDialog(null, "no puede ingresar una letra, debe ingresar un valor numerico",
					"NumberFormatException - Error de formato", JOptionPane.ERROR_MESSAGE);
		}
		}while(!numeroValido);
		return numero;
	}
	
	
	

}
