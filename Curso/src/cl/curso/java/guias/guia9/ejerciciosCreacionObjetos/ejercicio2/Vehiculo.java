package cl.curso.java.guias.guia9.ejerciciosCreacionObjetos.ejercicio2;

public class Vehiculo {

	private String codigo;
	private String marca;
	private String tipo;
	private String patente;
	private int modelo;
	private int kilometraje;
	private int precioDeVenta;
	private int cantidadUnidades;

	Vehiculo() {
		this.setCodigo("n/a");
		this.setMarca("n/a");
		this.setTipo("n/a");
		this.setPatente("n/a");
		this.setModelo(0);
		this.setKilometraje(0);
		this.setPrecioDeVenta(0);
		this.setCantidadUnidades(0);
	}

	public Vehiculo(String codigo, String marca, String tipo, String patente, int modelo, int kilometraje,
			int precioDeVenta, int cantidadUnidades) {
		super();
		this.setCodigo(codigo);
		this.setMarca(marca);
		this.setTipo(tipo);
		this.setPatente(patente);
		this.setModelo(modelo);
		this.setKilometraje(kilometraje);
		this.setPrecioDeVenta(precioDeVenta);
		this.setCantidadUnidades(cantidadUnidades);
	}

	public void vender() {
		if (this.getCantidadUnidades() <= 0) {
			System.out.println("no quedan unidades para vender");
		} else {
			this.setCantidadUnidades(this.getCantidadUnidades() - 1);
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public int getPrecioDeVenta() {
		return precioDeVenta;
	}

	public void setPrecioDeVenta(int precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}

	public int getCantidadUnidades() {
		return cantidadUnidades;
	}

	public void setCantidadUnidades(int cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}
}
