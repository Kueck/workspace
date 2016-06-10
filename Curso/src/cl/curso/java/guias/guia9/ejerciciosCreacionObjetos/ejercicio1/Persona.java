package cl.curso.java.guias.guia9.ejerciciosCreacionObjetos.ejercicio1;

public class Persona {

	private String nombre;
	private String apellido;
	private int numero;
	
	public Persona(){
		this.setNombre("");
		this.setApellido("");
		this.setNumero(0);
	}
	
	public Persona(String n,String ap,int numero){
		this.setNombre(n);
		this.setApellido(ap);
		this.setNumero(numero);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		if(this.verificaLargoTelefono(numero))
		{
		this.numero = numero;
		}else{
			System.out.println("el numero de telefono ingresado no cumple con los requisitos de largo, se ha dejado el valor del numero en 0");
			this.numero=0;
		}
	}
	
	public boolean verificaLargoTelefono(int numero){
		return numero>100000000 && numero<999999999;
	}
	
	
	
	
}
