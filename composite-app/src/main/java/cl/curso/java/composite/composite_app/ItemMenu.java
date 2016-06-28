package cl.curso.java.composite.composite_app;

public class ItemMenu extends Menu {

	private String atajo;
	
	public ItemMenu() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ItemMenu(String nombre,String atajo) {
		super(nombre);
		this.atajo=atajo;
		// TODO Auto-generated constructor stub
	}
	
	public ItemMenu(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void pintarMenu(String espacio) {
		if(atajo!=null)
		System.out.println(espacio+"|-->"+this.getNombre()+" | "+atajo);
		else
		System.out.println(espacio+"|-->"+this.getNombre());
			
	}

	public String getAtajo() {
		return atajo;
	}

	public void setAtajo(String atajo) {
		this.atajo = atajo;
	}

	
	
	
}
