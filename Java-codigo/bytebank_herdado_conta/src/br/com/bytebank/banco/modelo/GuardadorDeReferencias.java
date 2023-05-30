package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	private Object[] referencia;
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		this.referencia = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencia[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}
	
	public Object getReferencia(int pos) {
		return this.referencia[pos];
	}
}
