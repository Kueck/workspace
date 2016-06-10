package cl.curso.java.guias.guia6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ejercicio6_6 {
	
	
	
	public int sumaDigitos(int x){
		String strX=String.valueOf(x);
		int res=0;
		for (int i = 0; i < strX.length(); i++) {
		res=Integer.parseInt(""+strX.charAt(i))+res;
		}
		return res;
	}

	public static void main(String[] args) {
		Ejercicio6_6 e6=new Ejercicio6_6();
		Scanner in=new Scanner(System.in);
		String strPatron="[0-9]+";
		Pattern patron=Pattern.compile(strPatron);
		String codigo="";
		int suma=0;
		
		while(true){
		System.out.println("ingrese su codigo");
		codigo=in.nextLine();
		Matcher match=patron.matcher(codigo);
		if(match.matches()){
		for (int i = codigo.length()-1; i>=0 ; i--) {
			if((i+1)%2==0){

			suma=suma+e6.sumaDigitos(Integer.parseInt(""+codigo.charAt(i))*2);
			}else{
			suma=suma+Integer.parseInt(""+codigo.charAt(i));
			}
		}
		if(suma%10==0){
			System.out.println("codigo correcto\n");
		}else{
			System.out.println("codigo incorrecto\n");
		}
	
		}else{
			
			if(codigo.equals("exit")){
				in.close();
				System.exit(0);
				
			}else{
			System.out.println("codigo incorrecto\n");
			}
		}
		}
	}
	

}
