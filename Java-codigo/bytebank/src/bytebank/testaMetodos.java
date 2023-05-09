package bytebank;

public class testaMetodos {
	public static void main(String[] args) {
		conta contaPaulo = new conta();
		contaPaulo.saldo = 100;
		contaPaulo.deposita(50);
		System.out.println(contaPaulo.saldo);
		
		boolean conseguiuRetirar = contaPaulo.saca(20);
		System.out.println(contaPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		conta contaMarcela = new conta();
		contaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaMarcela.transfere(300, contaPaulo);
		
		if(sucessoTransferencia) {
			System.out.println("transferência feita com sucesso");
		} else{
			System.out.println("saldo insuficiente");
		};
		System.out.println(contaMarcela.saldo);
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.titular = "Paulo Silveira";
		System.out.println(contaPaulo.titular);
	}
}
