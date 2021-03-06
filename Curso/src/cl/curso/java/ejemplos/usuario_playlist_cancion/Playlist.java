package cl.curso.java.ejemplos.usuario_playlist_cancion;

import java.util.ArrayList;

public class Playlist {

	private String nombre;
	private ArrayList<Cancion> canciones;
	private ArrayList<Usuario> seguidores;
	
	public Playlist() {
		// TODO Auto-generated constructor stub
	}

	public Playlist(String nombre, ArrayList<Cancion> canciones, ArrayList<Usuario> seguidores) {
		super();
		this.nombre = nombre;
		this.canciones = canciones;
		this.seguidores = seguidores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	public ArrayList<Usuario> getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(ArrayList<Usuario> seguidores) {
		this.seguidores = seguidores;
	}
	
	public void agregarCancion(Cancion cancionNueva){
			if(!this.getCanciones().contains(cancionNueva)){
				this.getCanciones().add(cancionNueva);
			}else{
				throw new CancionRepetidaException("la cancion "+cancionNueva.getNombre()+ "esta repetida");
			}
		}	
	
	
	public void eliminarCancion(Cancion cancionAElilminar){
		if(this.getCanciones().contains(cancionAElilminar)){
			this.getCanciones().remove(cancionAElilminar);
		}else{
			throw new CancionNoEncontradaException("la cancion "+cancionAElilminar.getNombre()+" no figura en la lista");
		}
		
	}
	
	public int duacionMin(){
		int suma=0;
		for (Cancion cancion : canciones) {
			suma=suma+cancion.getDuracionMin();
		}
		return suma;
	}
	
	
	
	
}
