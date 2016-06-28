package cl.ayudaProyecto.core;

import java.util.Map;

public class Configuracion {

	private Map<String,String> data;

	public Configuracion() {
		// TODO Auto-generated constructor stub
	}
	
	public Configuracion(Map<String, String> data) {
		super();
		this.data = data;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}
	
	
	
}
