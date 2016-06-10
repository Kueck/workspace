package cl.curso.java.abs_factory.abstract_factory;

public class GUIBuilder {

	public Window buildWindow(AbstractWidgetFactory awf){
		return awf.createWindow();
	}
	
	
}
