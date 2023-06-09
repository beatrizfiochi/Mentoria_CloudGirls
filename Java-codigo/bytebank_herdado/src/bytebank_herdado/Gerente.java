package bytebank_herdado;

//Gerente eh um Funcionario ou Gerente herda da class Funcionario, assina o contrato Autenticavel ou eh um Autenticavel
public class Gerente extends Funcionario implements Autenticavel{

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
}
