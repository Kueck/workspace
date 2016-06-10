package cl.curso.java.guias.guia8.ejercicio2;

public class Fecha {

	private int año;
	private int mes;
	private int dia;
	public final String[] MESES={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	
	Fecha(){
		this.año=19995;
		this.mes=5;
		this.dia=23;
	}
	
	Fecha(int dia,int mes,int año){
		this.año=año;
		this.mes=mes;
		this.dia=dia;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		if(this.getAño()%4==0){
			bisiesto=true;
		}
		if(this.getAño()%100==0){
			bisiesto=false;
		}
		if(this.getAño()%400==0){
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
		System.out.println(this.getDia()+"/"+this.getMes()+"/"+this.getAño());
	}
	
	public void imprimirFechaFormato(){
		System.out.println(this.getDia()+ " de "+this.getMESES()[this.getMes()-1]+" del "+this.getAño());
	}
	
}
