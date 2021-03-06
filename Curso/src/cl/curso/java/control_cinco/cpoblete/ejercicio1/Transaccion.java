package cl.curso.java.control_cinco.cpoblete.ejercicio1;

import java.util.Date;

/**
 * @author CamiloPoblete
 *
 */
public class Transaccion {

	private String id;
	private String tipo;
	private Date fecha;
	private int monto;

	/**
	 * 
	 */
	public Transaccion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param tipo
	 * @param fecha
	 * @param monto
	 */
	public Transaccion(String id, String tipo, Date fecha, int monto) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.fecha = fecha;
		this.monto = monto;
	}

	/**
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return
	 */
	public int getMonto() {
		return monto;
	}

	/**
	 * @param monto
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Transaccion)
			return this.getId().equals(((Transaccion) obj).getId());

		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", tipo=" + tipo + ", fecha=" + fecha + ", monto=" + monto + "]";
	}
	
	

}
