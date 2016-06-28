package cl.curso.java.command_composite.command_composite_app;

public abstract class Menu {

	private Command command=NullCommand.getInstance();
	private String nombre;

	public Menu(String nombre,Command c) {
		super();
		this.command = c;
		this.nombre=nombre;
	}	

	public Menu(String nombre) {
		super();
		this.nombre = nombre;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void click() {
		command.execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command c) {
		this.command = c;
	}

}
