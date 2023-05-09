package bytebank;

public class testeReferencias {
	public static void main(String[] args) {
		conta primeiraConta = new conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira: " + primeiraConta.saldo);
		
		conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda: " + segundaConta.saldo);
		
		segundaConta.saldo +=100;
		System.out.println("saldo da segunda: " + segundaConta.saldo);
		System.out.println("saldo da primeira: " + primeiraConta.saldo);

		if(primeiraConta == segundaConta) {
			System.out.println("são a mesmíssima conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
