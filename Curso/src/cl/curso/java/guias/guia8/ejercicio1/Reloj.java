package cl.curso.java.guias.guia8.ejercicio1;

public class Reloj {

	private int hora;
	private int min;
	private int seg;
	private boolean encendido;

	public Reloj() {
		this.hora = 0;
		this.min = 0;
		this.seg = 0;
		this.encendido = true;
	}

	public Reloj(int h, int m, int s) {
		this.hora = h;
		this.min = m;
		this.seg = s;
		this.encendido = true;
	}

	public void avanzarSegundo() {

		if (this.isEncendido()) {
			this.setSeg(this.getSeg() + 1);

			if (this.getSeg() >= 60) {
				this.setSeg(0);
				this.setMin(this.getMin() + 1);
			}
			if (this.getMin() >= 60) {
				this.setMin(0);
				this.setHora(this.getHora() + 1);
			}
			if (this.getHora() >= 24) {
				this.setHora(0);
			}
			if(this.getHora() ==0 && this.getMin()==0 && this.getSeg()==0){
				this.setEncendido(false);
			}
		}
	}

	public void retrocederSegundo() {

		this.setSeg(this.getSeg() - 1);

		if (this.getSeg() <= 0) {
			this.setSeg(59);
			this.setMin(this.getMin() - 1);
		}
		if (this.getMin() <= 0) {
			this.setMin(59);
			this.setHora(this.getHora() - 1);
		}
		if (this.getHora() <= 24) {
			this.setHora(0);
		}

	}

	public void imprimirHora() {
		System.out.println(this.hora + ":" + this.min + ":" + this.seg);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	boolean isEncendido() {
		return encendido;
	}

	void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

}
