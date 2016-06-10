package cl.curso.java.guias.guia8.ejercicio1;



public class PruebaReloj {

	public static void main(String[] args) throws InterruptedException {

		Reloj r1=new Reloj();
		Timer t2=new Timer(r1);
		ApagarReloj apagaReloj=new ApagarReloj(r1, 10001);		
		t2.start();
		apagaReloj.start();
		
	}

}
