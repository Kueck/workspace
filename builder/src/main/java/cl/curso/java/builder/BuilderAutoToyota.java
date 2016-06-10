package cl.curso.java.builder;

import java.util.ArrayList;

public class BuilderAutoToyota extends BuilderAuto {

	@Override
	public Auto construir() {
		
		ArrayList<Rueda> ruedas=new ArrayList<Rueda>();
		ruedas.add(new Rueda(1));
		ruedas.add(new Rueda(1));
		ruedas.add(new Rueda(1));
		ruedas.add(new Rueda(1));
		
		Motor m=new Motor(600);
		GPS gps=new GPS("android", "2.3.4");
		
		return new Auto("Toyota", "Yaris", ruedas, gps, m);
	}

}
