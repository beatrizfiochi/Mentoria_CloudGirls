package bytebank;

public class criaConta {
	public static void main(String[] args) {
		conta primeiraConta = new conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		conta segundaConta = new conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		if(primeiraConta == segundaConta) {
			System.out.println("são a mesmíssima conta");
		}else {
			System.out.println("são contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);


	}
}
