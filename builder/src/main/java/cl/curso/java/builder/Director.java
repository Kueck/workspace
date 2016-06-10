package cl.curso.java.builder;

public class Director {

	private BuilderAuto builder;

	public Director() {
		// TODO Auto-generated constructor stub
	}
	
	public Director(BuilderAuto builder) {
		super();
		this.builder = builder;
	}

	public BuilderAuto getBuilder() {
		return builder;
	}

	public void setBuilder(BuilderAuto builder) {
		this.builder = builder;
	}
	
	
	
}
