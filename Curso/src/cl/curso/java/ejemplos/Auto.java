package cl.curso.java.ejemplos;

public class Auto {

	String color;
	String marca;
	String patente;
	Motor motor;
	int cantidadKmRecorridos;

	public Auto(){   //construye un auto con valores por defecto
		this.color="azul";
		this.marca="honda";
		this.patente="EE-96-19";
		this.cantidadKmRecorridos=0;
	}
	
	public Auto(String color,String marca,String patente) //construye un auto estableciendo su color,marca y patente
	{
		this.color=color;
		this.marca=marca;
		this.patente=patente;
	}
	
	@Override
	public String toString() {  //ignoren esto xD (el metodo System.out.println() imprime segun lo que yo escriba aca)
		return "Auto [color=" + color + ", marca=" + marca + ", patente=" + patente + ",cantidadDeKmsRecorridos="+cantidadKmRecorridos+", motor=" + motor + "]";
	}

	public String getColor() { //obtiene el color del auto
		return color;
	}

	public void setColor(String color) { //establece un color para el auto
		this.color = color;
	}

	public String getMarca() { //obtiene la marca del auto
		return marca;
	}

	public void setMarca(String marca) {  //establece la marca del auto
		this.marca = marca;
	}

	public String getPatente() {  //obtiene la patente del auto
		return patente;
	}

	public void setPatente(String patente) { //establece la patente del auto
		this.patente = patente;
	}

	public Motor getMotor() { //obtiene el motor del auto
		return motor;
	}

	public void setMotor(Motor motor) { //establece un motor para el auto
		this.motor = motor;
	}

	
	public void avanzar(int km){ //avanza el auto la cantidad de kilometros recibida
		if(this.motor.isEncendido()){
		System.out.println("Avanza "+km+"Kms" );
		this.cantidadKmRecorridos=this.cantidadKmRecorridos+km;
		}
		else{
			System.out.println("Debe encender el auto para avanzar (DUH!)");
		}
	}
	
	public void detener(){//detiene el auto, apaga el motor DEL auto
		this.motor.setEncendido(false);
		System.out.println("Detener");
	}
	
	public void encender(){
		if(!this.motor.isEncendido()){ //enciende el motor DEL auto
		this.motor.setEncendido(true);
		System.out.println("motor encendido");
		}
		else{
			System.out.println("el motor ya esta encendido");
		}
		
	}
	
	
}
