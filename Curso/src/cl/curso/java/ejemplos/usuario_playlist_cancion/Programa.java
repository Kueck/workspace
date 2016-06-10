package cl.curso.java.ejemplos.usuario_playlist_cancion;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
		
		ArrayList<Cancion> canciones=new ArrayList<Cancion>();
		ArrayList<Usuario> seguidores=new ArrayList<Usuario>();
		ArrayList<Playlist> listaPlaylist=new ArrayList<Playlist>();
		
		Playlist playList1=new Playlist();
		Usuario user1;
		
		canciones.add(new Cancion("cancion 1", "artista 1", 1));
		canciones.add(new Cancion("cancion 2", "artista 2", 2));
		canciones.add(new Cancion("cancion 3", "artista 3", 3));
		canciones.add(new Cancion("cancion 4", "artista 4", 4));
		
		playList1.setCanciones(canciones);
		
		listaPlaylist.add(playList1);
		
		
		
		
		
	}
}
