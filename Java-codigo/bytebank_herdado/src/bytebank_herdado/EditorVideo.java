package bytebank_herdado;

//EditorVideo eh um Funcionario ou EditorVideo herda da class Funcionario
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		return super.getBonificacao() + 100;
	}
	
	
}
