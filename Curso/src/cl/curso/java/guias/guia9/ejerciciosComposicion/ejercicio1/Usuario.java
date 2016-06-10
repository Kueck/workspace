package cl.curso.java.guias.guia9.ejerciciosComposicion.ejercicio1;

public class Usuario {

	private String nombreUsuario;
	private String contraseña;
	private Perfil perfil;
	
	public Usuario(){
		this.setNombreUsuario("n/a");
		this.setContraseña("n/a");
		this.setPerfil(null);
	}

	public Usuario(String nombreUsuario, String contraseña, Perfil perfil) {
		super();
		this.setNombreUsuario(nombreUsuario);
		this.setContraseña(contraseña);
		this.setPerfil(perfil);
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	
}

