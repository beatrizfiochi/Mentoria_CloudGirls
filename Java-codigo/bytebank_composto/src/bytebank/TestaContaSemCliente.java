package bytebank;

public class TestaContaSemCliente {
	public static void main(String[] args) {
		conta contaMarcela = new conta();
		System.out.println(contaMarcela.getSaldo());
		
		contaMarcela.titular = new Cliente();
		System.out.println(contaMarcela.titular);
		
		contaMarcela.titular.nome = "Marcela Pereira";
		System.out.println(contaMarcela.titular.nome);
	}
}
