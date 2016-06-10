package cl.curso.java.ejemplos.usuario_playlist_cancion;

public class Cancion {

	private String nombre;
	private String artista;
	private int duracionMin;

	public Cancion() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Cancion(String nombre, String artista, int duracionMin) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracionMin = duracionMin;
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Cancion){
			return ( (Cancion)obj ).getNombre().equals( this.getNombre() )&&( (Cancion)obj ).getArtista().equals( this.getArtista() );
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(int duracionMin) {
		this.duracionMin = duracionMin;
	}

}
