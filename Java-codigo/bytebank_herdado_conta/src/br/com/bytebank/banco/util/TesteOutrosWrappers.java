package br.com.bytebank.banco.util;

import java.util.List;
import java.util.ArrayList;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29); //autoboxing transformando um primitivo em um objeto
		System.out.println(idadeRef.intValue()); //unboxing transformando um objeto em um primitivo
		
		Double dRef = Double.valueOf(3.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.TRUE; //autoboxing
		System.out.println(bRef.booleanValue()); //unboxing
		
		Number refNumero = Double.valueOf(29.9); //Number é mais genérico
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.2);
		
		List lista2 = new ArrayList();
		
		

	}

}
