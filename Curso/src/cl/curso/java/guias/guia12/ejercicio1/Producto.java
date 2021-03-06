package cl.curso.java.guias.guia12.ejercicio1;

public class Producto {

	private int identificador;
	private String nombre;
	private int precio;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(int identificador, String nombre, int precio) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.precio = precio;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Producto)
			return ((Producto) obj).getIdentificador() == this.getIdentificador();
		return false;
	}
}
