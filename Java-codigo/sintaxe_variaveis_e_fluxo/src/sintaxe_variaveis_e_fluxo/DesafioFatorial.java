package sintaxe_variaveis_e_fluxo;

public class DesafioFatorial {
	public static void main(String[] args) {
		int fatorial = 1;
		for(int n = 1; n <= 10; n++) {
			fatorial = fatorial * n;
			System.out.println("fatorial de " + n + "=" + fatorial);
		}
	}
}
