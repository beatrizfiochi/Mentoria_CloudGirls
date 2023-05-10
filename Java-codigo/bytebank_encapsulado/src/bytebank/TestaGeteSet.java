package bytebank;

public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
	
		Cliente paulo = new Cliente();
		conta.setTitular(paulo);
		
		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		//agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
		
	}


}
