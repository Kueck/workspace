package cl.curso.java.control_cuatro.cpoblete.ejercicio6;

/**
 * @author CamiloPoblete
 *
 */
public class Auto {

	// Atributos

	private String marca;
	private String modelo;
	private int anio;
	private int stock;

	/**
	 * Constructor por defecto
	 */
	public Auto() {
		this.marca = "";
		this.modelo = "";
		this.anio = 0;
		this.stock = 0;
	}

	/**
	 * @param marca
	 * @param modelo
	 * @param anio
	 * @param stock
	 */
	public Auto(String marca, String modelo, int anio, int stock) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.stock = stock;
	}

	/**
	 * @return
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * metodo venderAuto
	 * 
	 * @exception SinStockException
	 *                el metodo venderAuto simula la venta de un vehiculo si el
	 *                stock de dicho vehiculo es 0 o menos se lanza la excepcion
	 *                {@link SinStockException}
	 */
	public void venderAuto() {
		if (this.getStock() <= 0) {
			throw new SinStockException("No es posible vender auto. No hay stock");
		}
		this.setStock(this.getStock() - 1);
		System.out.println("Auto vendido con exito");
	}

}
