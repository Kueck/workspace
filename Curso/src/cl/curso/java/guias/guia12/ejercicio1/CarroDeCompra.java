package cl.curso.java.guias.guia12.ejercicio1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarroDeCompra {

	private Usuario usuario;
	private List<Producto> productos;

	public CarroDeCompra() {
		// TODO Auto-generated constructor stub
	}

	public CarroDeCompra(Usuario usuario, List<Producto> productos) {
		super();
		this.usuario = usuario;
		this.productos = productos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public void agregarProducto(Producto prod) {
		this.getProductos().add(prod);
	}

	public void eliminarProducto(Producto prod) {
		if (this.getProductos().contains(prod))
			this.getProductos().remove(prod);
		else
			throw new ProductoNoEncontradoException("producto no encontrado");
	}

	public void ordenarPorPrecio() {

		Collections.sort(this.getProductos(), new Comparator<Producto>() {

			@Override
			public int compare(Producto o1, Producto o2) {
				if (o1.getIdentificador() == o2.getIdentificador())
					return 0;
				if (o1.getIdentificador() > o2.getIdentificador())
					return 1;
				return -1;
			}

		});

	}

}
