package cl.curso.java.guias.guia11.ejercicio2;

import javax.swing.JOptionPane;

public class ProgramaUsuarioLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario u1 = new Usuario("adrian", "infloGlobosConElPoto");
		u1.setIntentosFallidos(2);
		try {
			u1.Login("adrian", "ajdksjfdkls");
		}
		catch (CuentaBloqueada e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (AutenticacionException a) {
		a.printStackTrace();
			JOptionPane.showMessageDialog(null, "Usuario invalido o contraseņa invalido");
		}
	}

}
