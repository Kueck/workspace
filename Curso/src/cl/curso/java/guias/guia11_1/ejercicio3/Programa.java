package cl.curso.java.guias.guia11_1.ejercicio3;

public class Programa {

	public static void main(String[] args) {
		
		Asiento[] asientos = new Asiento[20];
		Bus bus;
		
		for (int i = 0; i < asientos.length; i++) {
			asientos[i]=new Asiento();
		}
		
		bus=new Bus("pato express",asientos);
		
		ReservarAsiento ra1=new ReservarAsiento(bus,1);
		ReservarAsiento ra2=new ReservarAsiento(bus,1);
		ReservarAsiento ra3=new ReservarAsiento(bus,1);
		ReservarAsiento ra4=new ReservarAsiento(bus,1);
		
		ra1.start();
		ra2.start();
		ra3.start();
		ra4.start();
		
	}
	
	
}
