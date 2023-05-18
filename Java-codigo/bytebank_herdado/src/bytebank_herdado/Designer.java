package bytebank_herdado;

//Designer eh um Funcionario ou Designer herda da class Funcionario
public class Designer extends Funcionario{
	
	public double getBonificacao() {
		return 200;
	}
	
	
	//outra forma de não forçar o compilador há termos o método que foi definido como abstrato na classe Funcionario é deixar essa classe abstrata tbm, porém dessa forma nao podemos dar new.
	
}
