package cl.curso.java.guias.guia11.ejercicio2;

public class Usuario {

	private String nombre;
	private String contrase�a;
	private int intentosFallidos;
	
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	String getContrase�a() {
		return contrase�a;
	}
	void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public Usuario(String nombre, String contrase�a) {
		super();
		this.nombre = nombre;
		this.contrase�a = contrase�a;
	}
	
	public void Login(String nombreDeUsuario, String contrase�a) throws CuentaBloqueada, AutenticacionException{
		
		if(this.getIntentosFallidos()>=3){
			throw new CuentaBloqueada("Cuenta Bloqueada");
		}
		if(this.getNombre().equals(nombreDeUsuario) && this.getContrase�a().equals(contrase�a)){
			System.out.println("logueado con existo");
		}else{
			this.setIntentosFallidos(this.getIntentosFallidos()+1);
			
			throw new AutenticacionException("usuario o contrase�a invalidos");
			
		}
		
		
	}
	int getIntentosFallidos() {
		return intentosFallidos;
	}
	void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	
	
	
	
	
}


