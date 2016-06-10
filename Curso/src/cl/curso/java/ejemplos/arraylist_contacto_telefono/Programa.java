package cl.curso.java.ejemplos.arraylist_contacto_telefono;

import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {
	
		Contacto c1=new Contacto("camilo", 71786222, "cpoblete.4f12@gmail.com");
		Contacto c2=new Contacto("luis", 21786222, "lpoblete.4f12@gmail.com");
		Contacto c3=new Contacto("manuel", 31786222, "mpoblete.4f12@gmail.com");
		
		ArrayList<Contacto> listaContactos= new ArrayList<Contacto>();
		listaContactos.add(c1);
		listaContactos.add(c2);
		listaContactos.add(c3);
		
		Telefono telefono=new Telefono(listaContactos);
		
		telefono.imprimirFor();
		System.out.println("-----------------------------");
		telefono.imprmirForEach();
		System.out.println("-----------------------------");
		telefono.imprimirIterador();
		
		
	}
	
	
}
