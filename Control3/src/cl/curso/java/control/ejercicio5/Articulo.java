package cl.curso.java.control.ejercicio5;

public class Articulo {

	private String nombre;
	private int costoBase;
	
	public Articulo(String nombre,int costoBase){
		
		this.nombre=nombre;
		this.costoBase=costoBase;
		
	}
	
	public double precioAlDetalle(){
		double precioAlDetalle;
		precioAlDetalle=this.costoBase+(this.costoBase*0.3);
		return precioAlDetalle;
	}
	
	public double precioAlMayor(){
		double precioAlMayor;
		precioAlMayor=this.costoBase+(this.costoBase*0.15);
		return precioAlMayor;
	}
	
	public void imprimir(){
		System.out.println("nombre:"+this.nombre
				+"\ncosto Base:"+this.costoBase);
	}
	
	public int getCostoBase(){
		return this.costoBase;
	}
	
	public void setCostoBase(int costo){
		this.costoBase=costo;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
}
