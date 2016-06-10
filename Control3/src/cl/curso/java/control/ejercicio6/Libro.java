package cl.curso.java.control.ejercicio6;

public class Libro {

	private String titulo;
	private String autor;
	private int cantidadEjemplares;
	private int cantidadEjemplaresPrestados;

	public Libro(String titulo, String autor, int cEjemplares, int cEjemplaresPrestados) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.cantidadEjemplares = cEjemplares;
		this.cantidadEjemplaresPrestados = cEjemplaresPrestados;
	}

	public void prestarLibro() {
		if (this.cantidadEjemplaresPrestados < this.cantidadEjemplares) {
			this.cantidadEjemplaresPrestados = this.cantidadEjemplaresPrestados + 1;
		} else {
			System.out.println("no quedan libros para prestar");
		}
	}

	public void devolverLibro() {
		if (this.cantidadEjemplaresPrestados <= this.cantidadEjemplares && this.cantidadEjemplaresPrestados>0) {
			this.cantidadEjemplaresPrestados = this.cantidadEjemplaresPrestados - 1;
		} else {
			System.out.println(
					"ya se posee la cantidad de ejemplares total, ud esta devolviendo un libro que no nos pertenece");
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCantidadEjemplares() {
		return cantidadEjemplares;
	}

	public void setCantidadEjemplares(int cantidadEjemplares) {
		this.cantidadEjemplares = cantidadEjemplares;
	}

	public int getCantidadEjemplaresPrestados() {
		return cantidadEjemplaresPrestados;
	}

	public void setCantidadEjemplaresPrestados(int cantidadEjemplaresPrestados) {
		this.cantidadEjemplaresPrestados = cantidadEjemplaresPrestados;
	}

	public void imprimir() {
		System.out.println("Titulo                          :" + this.titulo + "\nAutor                           :"
				+ this.autor + "\nCantidad de Ejemplares          :" + this.cantidadEjemplares
				+ "\nCantidad de Ejemplares prestados:" + this.cantidadEjemplaresPrestados+"\n\n");
	}

}
