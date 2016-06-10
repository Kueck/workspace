package cl.curso.java.abs_factory.abstract_factory;

public class MsWindowsWidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {

		
		return new MSWindow();
	}
	
	

}
