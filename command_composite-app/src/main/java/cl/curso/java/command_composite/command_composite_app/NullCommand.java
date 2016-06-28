package cl.curso.java.command_composite.command_composite_app;

public class NullCommand implements Command {

	
	private static NullCommand nullCommand;
	
	private NullCommand() {
		// TODO Auto-generated constructor stub
	}
	
	public void execute() {		
	}
	
	public static NullCommand getInstance(){
		
		if(null==NullCommand.nullCommand){
			NullCommand.nullCommand=new NullCommand();
			return nullCommand;
		}else{
			return nullCommand;
		}
		
	}
	
	

}
