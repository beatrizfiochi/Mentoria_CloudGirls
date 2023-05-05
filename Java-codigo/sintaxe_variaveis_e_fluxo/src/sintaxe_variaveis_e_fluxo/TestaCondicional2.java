package sintaxe_variaveis_e_fluxo;

public class TestaCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 1;
		
		
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
		
		
		if (idade >= 18 && quantidadePessoas >= 2) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
		
		
		boolean acompanhado = quantidadePessoas >= 2;
		System.out.println("valor de acompanhado = " + acompanhado);
		if(idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
