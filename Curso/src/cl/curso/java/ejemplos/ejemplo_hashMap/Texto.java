package cl.curso.java.ejemplos.ejemplo_hashMap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Texto {

	String texto;

	public Texto() {
		// TODO Auto-generated constructor stub
	}

	public Texto(String txt) {
		this.texto = txt;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Map<String, Integer> mapear() {
		String x = this.getTexto().replaceAll(",", "");
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		String[] splittedText = x.split(" ");
		for (int i = 0; i < splittedText.length; i++) {
			if (mapa.putIfAbsent(splittedText[i], 1) != null) {
				mapa.put(splittedText[i], mapa.get(splittedText[1]) + 1);
			}
		}

		return mapa;

	}

	
	
}
