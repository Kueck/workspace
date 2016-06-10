package cl.curso.java.guias.guia9.ejerciciosCreacionObjetos.ejercicio4;

public class Equipo {

	private String nombre;
	private int cantGanados;
	private int cantPerdidos;
	private int cantEmpatados;
	private int cantJugados;
	private int cantPuntos;
	
	public Equipo(){
		this.setNombre("");
		this.setCantGanados(0);
		this.setCantPerdidos(0);
		this.setCantEmpatados(0);
		this.setCantJugados(this.getCantGanados()+this.getCantPerdidos()+this.getCantEmpatados());
		this.setCantPuntos(this.getCantGanados()*3+this.getCantEmpatados());
	}		
	

	public Equipo(String n,int cantGanados,int cantPerdidos,int cantEmpatados){
		this.setNombre(n);
		this.setCantGanados(cantGanados);
		this.setCantPerdidos(cantPerdidos);
		this.setCantEmpatados(cantEmpatados);
		this.setCantJugados(this.getCantGanados()+this.getCantPerdidos()+this.getCantEmpatados());
		this.setCantPuntos(this.getCantGanados()*3+this.getCantEmpatados());
	}		
	
	public void ganar(){
		this.setCantJugados(this.getCantJugados()+1);
		this.setCantGanados(this.getCantGanados()+1);
		this.setCantPuntos(this.getCantPuntos()+3);
	}

	public void empatar(){
		this.setCantJugados(this.getCantJugados()+1);
		this.setCantEmpatados(this.getCantEmpatados()+1);
		this.setCantPuntos(this.getCantPuntos()+1);
	}
	
	public void perder(){
		this.setCantJugados(this.getCantJugados()+1);
		this.setCantPerdidos(this.getCantPerdidos()+1);
		this.setCantPuntos(this.getCantPuntos()+3);
	}	
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantGanados() {
		return cantGanados;
	}


	public void setCantGanados(int cantGanados) {
		this.cantGanados = cantGanados;
	}


	public int getCantPerdidos() {
		return cantPerdidos;
	}


	public void setCantPerdidos(int cantPerdidos) {
		this.cantPerdidos = cantPerdidos;
	}


	public int getCantEmpatados() {
		return cantEmpatados;
	}


	public void setCantEmpatados(int cantEmpatados) {
		this.cantEmpatados = cantEmpatados;
	}


	public int getCantJugados() {
		return cantJugados;
	}


	public void setCantJugados(int cantJugados) {
		this.cantJugados = cantJugados;
	}


	public int getCantPuntos() {
		return cantPuntos;
	}


	public void setCantPuntos(int cantPuntos) {
		this.cantPuntos = cantPuntos;
	}
	
	
}
