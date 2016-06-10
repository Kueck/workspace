package cl.curso.java.guias.guia8.ejercicio2;

public class Fecha {

	private int a�o;
	private int mes;
	private int dia;
	public final String[] MESES={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	
	Fecha(){
		this.a�o=19995;
		this.mes=5;
		this.dia=23;
	}
	
	Fecha(int dia,int mes,int a�o){
		this.a�o=a�o;
		this.mes=mes;
		this.dia=dia;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String[] getMESES() {
		return MESES;
	}
	
	public boolean isBisiesto(){
		boolean bisiesto=false;
		if(this.getA�o()%4==0){
			bisiesto=true;
		}
		if(this.getA�o()%100==0){
			bisiesto=false;
		}
		if(this.getA�o()%400==0){
			bisiesto=true;
		}
		return bisiesto;
		
	}
	
	public boolean validarMes(){
		return this.getMes()>0 && this.getMes()<13;
	}
	
	public boolean validarDia(){
		
		if(this.getMes()==4 || this.getMes()==6 || this.getMes()==9 || this.getMes()==11){
			return this.getMes()>0 && this.getMes()<=30;
		}else{
			if(this.getMes()==2){
				if(this.isBisiesto()){
				return this.getMes()>0 && this.getMes()<=29;
				}else{
					return this.getMes()>0 && this.getMes()<=28;
				}
			}else{
				return this.getMes()>0 && this.getMes()<=31;
			}
		}
	}
	
	public void imprimirFecha(){
		System.out.println(this.getDia()+"/"+this.getMes()+"/"+this.getA�o());
	}
	
	public void imprimirFechaFormato(){
		System.out.println(this.getDia()+ " de "+this.getMESES()[this.getMes()-1]+" del "+this.getA�o());
	}
	
}
