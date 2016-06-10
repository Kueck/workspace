package cl.curso.java.guias.guia11.ejercicio2;

public class Usuario {

	private String nombre;
	private String contraseña;
	private int intentosFallidos;
	
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	String getContraseña() {
		return contraseña;
	}
	void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Usuario(String nombre, String contraseña) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	
	public void Login(String nombreDeUsuario, String contraseña) throws CuentaBloqueada, AutenticacionException{
		
		if(this.getIntentosFallidos()>=3){
			throw new CuentaBloqueada("Cuenta Bloqueada");
		}
		if(this.getNombre().equals(nombreDeUsuario) && this.getContraseña().equals(contraseña)){
			System.out.println("logueado con existo");
		}else{
			this.setIntentosFallidos(this.getIntentosFallidos()+1);
			
			throw new AutenticacionException("usuario o contraseña invalidos");
			
		}
		
		
	}
	int getIntentosFallidos() {
		return intentosFallidos;
	}
	void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}

	
	
	
	
	
}


