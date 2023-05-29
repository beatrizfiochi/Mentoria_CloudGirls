package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoinsuficienteException;
import br.com.bytebank.banco.modelo.Conta;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200);
		try {
			conta.saca(210);
		} catch(SaldoinsuficienteException ex){
			System.out.println("Excecao: " + ex.getMessage());
		}

		
		System.out.println(conta.getSaldo());
	}

}