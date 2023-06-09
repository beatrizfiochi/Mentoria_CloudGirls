package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencia;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencia = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencia[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencia[pos];
	}
}
