package cl.curso.java.guias.guia7.ejercicio2;

import javax.swing.JOptionPane;

public class CafeteraTest {

	public static void main(String[] args) {
	
		Cafetera c1=new Cafetera();
		Cafetera c2=new Cafetera(3500);
		Cafetera c3=new Cafetera(3000,10000);
		
		System.out.println("cafetera 1");
		c1.imprimir();
		System.out.println("__________________________");
		System.out.println("cafetera 2:");
		c2.imprimir();
		System.out.println("__________________________");
		System.out.println("cafetera 3:");
		c3.imprimir();
		
		System.out.println("\n\n_________llenar cafeteras_________\n");
		c1.llenarCafetera();
		c2.llenarCafetera();
		c3.llenarCafetera();
		System.out.println("cafetera 1");
		c1.imprimir();
		System.out.println("__________________________");
		System.out.println("cafetera 2:");
		c2.imprimir();
		System.out.println("__________________________");
		System.out.println("cafetera 3:");
		c3.imprimir();
		
		System.out.println("\n\n_________vaciar cafeteras_________\n");
		c1.vaciarCafetera();
		c2.vaciarCafetera();
		c3.vaciarCafetera();
		System.out.println("cafetera 1");
		c1.imprimir();
		System.out.println("__________________________");
		System.out.println("cafetera 2:");
		c2.imprimir();
		System.out.println("__________________________");
		System.out.println("cafetera 3:");
		c3.imprimir();
		
		System.out.println("\n\n_________poner cafe en cafeteras_________\n");
		c1.agregarCafe(5000);
		c2.agregarCafe(1);
		c3.agregarCafe(30);
		System.out.println("cafetera 1 -se agregaron 5000cc de cafe");
		c1.imprimir();
		System.out.println("__________________________");
		System.out.println("cafetera 2 -se agrego 1cc de cafe");
		c2.imprimir();
		System.out.println("__________________________");
		System.out.println("cafetera 3 -se agregaron 30 cc de cafe");
		c3.imprimir();
		
		
	}

}
