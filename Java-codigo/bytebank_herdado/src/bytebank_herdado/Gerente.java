package bytebank_herdado;

//Gerente eh um Funcionario ou Gerente gerda da class Funcionario
public class Gerente extends Funcionario{

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
//	public boolean autentica(String login, int senha) {    //sobrecarga de método
//		
//	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
	
	
}
