package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura"; //object literal //uma string é imutável
		//String outro = new String ("Alura");
		
		//String outra = nome.replace("A", "a");
		
		String outra = nome.toLowerCase();
		
		String nova = nome.toUpperCase();
		
		char c = nome.charAt(2); //posição
		
		int posicao = nome.indexOf("ur"); //posição
		
		String sub = nome.substring(1);
		
		String vazio = " Alura ";
		String outroVazio = vazio.trim();
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(nova);
		
		System.out.println(c);
		System.out.println(posicao);
		
		System.out.println(sub);
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(vazio);
		System.out.println(outroVazio);
		System.out.println(vazio.isEmpty());
		System.out.println(outroVazio.isEmpty());
		
		System.out.println(vazio.contains("Alu"));
	}

}
