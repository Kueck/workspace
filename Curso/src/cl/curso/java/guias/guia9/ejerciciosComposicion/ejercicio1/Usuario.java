package cl.curso.java.guias.guia9.ejerciciosComposicion.ejercicio1;

public class Usuario {

	private String nombreUsuario;
	private String contrase�a;
	private Perfil perfil;
	
	public Usuario(){
		this.setNombreUsuario("n/a");
		this.setContrase�a("n/a");
		this.setPerfil(null);
	}

	public Usuario(String nombreUsuario, String contrase�a, Perfil perfil) {
		super();
		this.setNombreUsuario(nombreUsuario);
		this.setContrase�a(contrase�a);
		this.setPerfil(perfil);
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	
}

