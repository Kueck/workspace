package cl.curso.java.ejemplos;

/**
 * @author Usuario
 *
 */
public class Motor {

	int caballoDeFuerza;
	String tipo;
	boolean encendido;
	
	
	@Override
	public String toString() {
		return "Motor [caballoDeFuerza=" + caballoDeFuerza + ", tipo=" + tipo + ", encendido=" + encendido + "]";
	}

	public boolean isEncendido() { //obtiene el valor de encendido (verdadero ó falso)
		return encendido;
	}

	public void setEncendido(boolean encendido) {//establece un valor para encendido 
		this.encendido = encendido;
	}

	public Motor(){//construye un motor con valores por defecto
		this.caballoDeFuerza=1000;
	}

	public Motor(int caballoDeFuerza){//construye un motor estableciendo los caballos de fuerza
		this.caballoDeFuerza=caballoDeFuerza;
	}

	public Motor(int caballoDeFuerza, String tipo) {//construye un motor estableciendo los caballos de fuerza y el tipo de motor
		this.caballoDeFuerza = caballoDeFuerza;
		this.tipo = tipo;
	}
	

	public int getCaballoDeFuerza() {//obtiene los caballos de fuerza del motor
		return caballoDeFuerza;
	}
	
	public void setCaballoDeFuerza(int caballoDeFuerza) {//establece un valor para los caballos de fuerza
		this.caballoDeFuerza = caballoDeFuerza;
	}
	
	public String getTipo() {//obtiene el tipo de motor
		return tipo;
	}
	
	public void setTipo(String tipo) {//estable un tipo para el motor
		this.tipo = tipo;
	}
	
	
	
	
	
}
