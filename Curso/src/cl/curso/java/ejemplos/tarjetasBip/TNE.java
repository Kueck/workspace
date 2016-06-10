package cl.curso.java.ejemplos.tarjetasBip;

import java.util.Date;

abstract public class TNE extends TarjetaBip {

	private String nombre;
	private Date fechaDeExpiracion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaDeExpiracion() {
		return fechaDeExpiracion;
	}
	public void setFechaDeExpiracion(Date fechaDeExpiracion) {
		this.fechaDeExpiracion = fechaDeExpiracion;
	}
	
	
}
