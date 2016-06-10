package cl.curso.java.builder;

import java.util.ArrayList;

public class BuilderAutoTesla extends BuilderAuto {

	@Override
	public Auto construir() {
		ArrayList<Rueda> ruedas=new ArrayList<Rueda>();
		ruedas.add(new Rueda(2));
		ruedas.add(new Rueda(2));
		ruedas.add(new Rueda(2));
		ruedas.add(new Rueda(2));
		
		Motor m=new Motor(1300);
		GPS gps=new GPS("TeslaOS", "2.0.0");
		
		return new Auto("Tesla", "r400", ruedas, gps, m);
	}

}
