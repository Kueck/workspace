package cl.curso.java.guias.guia11.ejercicio1;

public class Rut {

	private int numero;
	private String digitoVerificador;

	public Rut() {

	}

	public Rut(int numero, String dver) {
		this.numero = numero;
		this.digitoVerificador = dver.toUpperCase();
	}

	int getNumero() {
		return numero;
	}

	void setNumero(int numero) {
		this.numero = numero;
	}

	String getDigitoVerificador() {
		return digitoVerificador;
	}

	void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public void validar() {
		int aux = numero;
		int suma = 0;
		int mult = 2;
		int checksum=0;
		while (aux >= 1) {
			if (mult == 8) {
				mult = 2;
			}
			suma = suma + ((aux % 10) * mult);
			aux = aux / 10;
			mult++;
			
		}
		checksum=11-(suma%11);
		if( ( checksum==11 && 0==Integer.parseInt( this.getDigitoVerificador() ) )
				|| ( checksum==10 && this.getDigitoVerificador().equals("K") )
				|| ( String.valueOf(checksum).equals(this.getDigitoVerificador()) ) ){
			System.out.println("rut correcto");	
		}else{
			throw new RutNoValidoException("Rut no valido");
		}
		
		
			
		}

	

	// 18938884-5
	// Exception
	// RunTimeException

}
