package sintaxe_variaveis_e_fluxo;

public class DesafioMultiplos3 {
	public static void main(String[] args) {
		for (int multiplo = 0; multiplo <= 100; multiplo++){
			if (multiplo % 3 == 0) {
				System.out.println(multiplo);
			}
		}
	}
}
