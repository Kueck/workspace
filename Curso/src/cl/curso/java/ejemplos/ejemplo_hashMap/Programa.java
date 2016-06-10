package cl.curso.java.ejemplos.ejemplo_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Programa {

	public static void main(String[] args) {

		
	String x= "a b c d e f g h i j k l m n � o p q r s t u v w x y z ";
	Texto text=new Texto(x);
	
	HashMap hashMap=(HashMap)text.mapear();
	Iterator<Entry<String,Integer>> it=hashMap.entrySet().iterator();
	
	System.out.println(text.mapear().size());
	System.out.println(((HashMap)text.mapear()).get("x"));
	
	while(it.hasNext()){
		Entry<String,Integer> e=it.next();
		System.out.println(e.getKey()+ ":"+e.getValue());
	}
	
	}

}
