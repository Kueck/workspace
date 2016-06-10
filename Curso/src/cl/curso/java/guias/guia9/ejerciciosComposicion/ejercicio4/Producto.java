package cl.curso.java.guias.guia9.ejerciciosComposicion.ejercicio4;

public class Producto {

	private String nombre;
	private String tipoDeArticulo;
	private int cantidad;
	private int precio;
	
	public Producto(){
		this.setNombre("n/a");
		this.setTipoDeArticulo("n/a");
		this.setCantidad(0);
		this.setPrecio(0);
	}

	public Producto(String nombre, String tipoDeArticulo, int cantidad, int precio) {
		super();
		this.setNombre(nombre);
		this.setTipoDeArticulo(tipoDeArticulo);
		this.setCantidad(cantidad);
		this.setPrecio(precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public void setTipoDeArticulo(String tipoDeArticulo) {
		this.tipoDeArticulo = tipoDeArticulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
