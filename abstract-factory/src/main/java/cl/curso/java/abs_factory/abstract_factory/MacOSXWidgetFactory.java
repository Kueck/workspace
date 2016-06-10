package cl.curso.java.abs_factory.abstract_factory;

public class MacOSXWidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {
		// TODO Auto-generated method stub
		return new MacOSXWindow();
	}
	
}
