package cl.curso.java.builder;

public class GPS {

	private String os;
	private String version;
	
	public GPS() {
		// TODO Auto-generated constructor stub
	}

	public GPS(String os, String version) {
		super();
		this.os = os;
		this.version = version;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
