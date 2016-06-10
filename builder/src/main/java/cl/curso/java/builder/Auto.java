package cl.curso.java.builder;

import java.util.List;

public class Auto {

	private String marca;
	private String modelo;
	private List<Rueda> rueda;
	private GPS gps;
	private Motor motor;
	
	public Auto() {
		// TODO Auto-generated constructor stub
	}

	public Auto(String marca, String modelo, List<Rueda> rueda, GPS gps, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.rueda = rueda;
		this.gps = gps;
		this.motor = motor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public List<Rueda> getRuedas() {
		return rueda;
	}

	public void setRuedas(List<Rueda> rueda) {
		this.rueda = rueda;
	}

	public GPS getGps() {
		return gps;
	}

	public void setGps(GPS gps) {
		this.gps = gps;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	
	
}
