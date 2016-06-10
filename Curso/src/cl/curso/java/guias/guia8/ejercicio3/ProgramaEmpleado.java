package cl.curso.java.guias.guia8.ejercicio3;


public class ProgramaEmpleado {

	public static void main(String[] args) {
	
		Empleado e1=new Empleado(5000,500,3);
		System.out.println("horas extras:"+e1.getHorasExtrasRealizadas());
		System.out.println("pago por hora extra:"+e1.getPagoHorasExtra());
		System.out.println("sueldo base:"+e1.getSueldoBase());
		System.out.println("sueldo bruto:"+e1.sueldoBruto());
		System.out.println("sueldo liquido:"+e1.sueldoLiquido());
	}	

}
