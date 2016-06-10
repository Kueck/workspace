package cl.curso.java.guias.guia9.ejerciciosCreacionObjetos.ejercicio5;

public class Disco {

	private String nombre;
	private String autor;
	private String genero;
	private String[] canciones;

	public Disco() {
		this.setNombre("n/a");
		this.setAutor("n/a");
		this.setGenero("n/a");
		setCanciones(new String[0]);
	}

	public Disco(String nombre, String autor, String genero, String[] canciones) {
		this.setNombre(nombre);
		this.setAutor(autor);
		this.setGenero(genero);
		this.setCanciones(canciones);
	}

	public void imprimir() {

		System.out.println("Nombre:"+this.getNombre()
							+"\nAutor:"+this.getAutor()
							+"\nGenero:"+this.getGenero());
		
		for (int i = 0; i < getCanciones().length; i++) {
			System.out.println((i+1)+".-"+this.getCanciones()[i]);
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String[] getCanciones() {
		return canciones;
	}

	public void setCanciones(String[] canciones) {
		this.canciones = canciones;
	}

}
