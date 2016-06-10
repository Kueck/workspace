package cl.curso.java.guias.guia9.ejerciciosComposicion.ejercicio4;

public class Tienda {

	private String nombre;
	private String tipoTienda;
	private Producto[] productos;
	
	public Tienda(){
		this.setNombre("n/a");
		this.setTipoTienda("n/a");
		this.setProductos(new Producto[0]);
	}

	public Tienda(String nombre, String tipoTienda, Producto[] productos) {
		super();
		this.setNombre(nombre);
		this.setTipoTienda(tipoTienda);
		this.setProductos(productos);
	}
	
	public void imprimir(){
		
		System.out.println("nombre:"+this.getNombre()
							+"\ntipo de Tienda:"+this.getTipoTienda()
							+"\nProductos:");
		for (int i = 0; i < getProductos().length; i++) {
			System.out.println(this.getProductos()[i].getNombre()+" : "+this.getProductos()[i].getPrecio()+"$");
		}
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoTienda() {
		return tipoTienda;
	}

	public void setTipoTienda(String tipoTienda) {
		this.tipoTienda = tipoTienda;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	
	
	
}
