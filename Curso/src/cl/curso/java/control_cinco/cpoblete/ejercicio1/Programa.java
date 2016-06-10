package cl.curso.java.control_cinco.cpoblete.ejercicio1;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author CamiloPoblete
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Transaccion t1= new Transaccion("1", "retiro", new Date(), 5000);
		Transaccion t2= new Transaccion("1", "deposito", new Date(1994,11,18), 5000);
		Transaccion t3= new Transaccion("1", "retiro", new Date(1992,8,7), 5000);
		
		ArrayList<Transaccion> transacciones= new ArrayList<Transaccion>();
		
		transacciones.add(t1);
		transacciones.add(t2);
		transacciones.add(t3);
		
		CuentaBancaria c1=new CuentaBancaria(1234, transacciones);
		
		c1.imprimir();
		
		System.out.println("----------------\nOrdenar por fecha\n----------------");
		c1.ordenarTransaccionesPorFecha();
		c1.imprimir();
		
		System.out.println("----------------\nOrdenar por tipo\n----------------");
		c1.ordenarTransaccionesPorTipo();
		c1.imprimir();
		
	}
	
}
