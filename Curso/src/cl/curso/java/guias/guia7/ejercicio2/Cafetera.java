package cl.curso.java.guias.guia7.ejercicio2;

public class Cafetera {

	int cMax;
	int cActual;
	
	public Cafetera(){
		this.cMax=1000;
		this.cActual=0;
	}
	
	public Cafetera(int cMax){
		this.cMax=cMax;
		this.cActual=this.cMax;
	}
	
	public Cafetera(int cMax,int cActual){
		
		this.cMax=cMax;
		if(this.cMax<cActual){
			this.cActual=this.cMax;
		}else{
			this.cActual=cActual;
		}		
	}
	
	public void llenarCafetera(){
		this.cActual=this.cMax;
	}
	
	public void servirTaza(int ccTaza){
		
		if(this.cActual<ccTaza){
			this.cActual=this.cActual-this.cActual;
			//cActual=0
		}else{
			this.cActual=this.cActual-ccTaza;
		}
		
	}
	
	public void vaciarCafetera(){
		this.cActual=this.cActual-this.cActual;
		//cActual=0
	}
	
	public void imprimir(){
		System.out.println("cantidad Actual:"+this.cActual
				+"\nCantidad Maxima:"+this.cMax);
	}
	
	public void agregarCafe(int cafe){
		this.cActual=this.cActual+cafe;
		if(this.cActual>this.cMax){
			this.cActual=this.cMax;
		}
	}
	
	
	
}
