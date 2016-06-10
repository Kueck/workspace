package cl.curso.java.control_cinco.cpoblete.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author CamiloPoblete
 *
 */
public class CuentaBancaria {

	private int numero;
	ArrayList<Transaccion> transacciones;
	
	/**
	 * 
	 */
	public CuentaBancaria() {
		this.transacciones = new ArrayList<Transaccion>();
	}

	/**
	 * @param numero
	 * @param transacciones
	 */
	public CuentaBancaria(int numero, ArrayList<Transaccion> transacciones) {
		super();
		this.numero = numero;
		this.transacciones = transacciones;
	}

	/**
	 * @return
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return
	 */
	public ArrayList<Transaccion> getTransacciones() {
		return transacciones;
	}

	/**
	 * @param transacciones
	 */
	public void setTransacciones(ArrayList<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
	
	/**
	 * metodo ordenarTransaccionesPorFecha()
	 * no retorna nada
	 * ordena la transacciones en base a su atributo de tipo Date "fecha"
	 */
	public void ordenarTransaccionesPorFecha(){
		
		Collections.sort(this.getTransacciones(), new Comparator<Transaccion>() {

			@Override
			public int compare(Transaccion o1, Transaccion o2) {
				return o1.getFecha().compareTo(o2.getFecha());
			}
		});
		
	}
	
	/**
	 * metodo ordenarTransaccionesPorTipo()
	 * no retorna nada
	 * ordena la transacciones en base a su atributo de tipo String "tipo"
	 */
	public void ordenarTransaccionesPorTipo(){
		
		Collections.sort(this.getTransacciones(),new Comparator<Transaccion>() {
			@Override
			public int compare(Transaccion o1, Transaccion o2) {
				return o1.getTipo().compareTo(o2.getTipo());
			}
		});
		
	}
	
	/**
	 *  imprime la lista de transacciones 
	 */
	public void imprimir(){
		
		for (Transaccion transaccion : transacciones) {
			System.out.println(transaccion);
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", transacciones=" + transacciones + "]";
	}
	
	
	
}
