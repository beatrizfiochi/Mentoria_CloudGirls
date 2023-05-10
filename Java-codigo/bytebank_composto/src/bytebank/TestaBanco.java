package bytebank;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "programador";
		
		conta contaPaulo = new conta();
		contaPaulo.deposita(100);
		
		//associa cliente paulo a conta contaPaulo
		contaPaulo.titular = paulo;
		System.out.println(contaPaulo.titular.nome);
		
		System.out.println(contaPaulo.titular);
		System.out.println(paulo);
		System.out.println(contaPaulo.getSaldo());
	}
}
