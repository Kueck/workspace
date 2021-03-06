package cl.curso.java.ejemplos.arraylist_contacto_telefono;

import java.util.ArrayList;
import java.util.Iterator;

public class Telefono {

	private ArrayList<Contacto> contactos;
	
	public Telefono() {
		// TODO Auto-generated constructor stub
	}

	public Telefono(ArrayList<Contacto> contactos) {
		super();
		this.setContactos(contactos);
	}
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	public void imprimirFor(){
		
		for (int i = 0; i < contactos.size(); i++) {
			//System.out.println(contactos.get(i));
			System.out.println(contactos.get(i).getNombre());
		}
		
	}
	
	public void imprmirForEach(){
		
		for(Contacto contacto:contactos){
			System.out.println(contacto);
		}
	}
	
	public void imprimirIterador(){
		Iterator<Contacto> iterador=contactos.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}
		
	}
	
	
}
