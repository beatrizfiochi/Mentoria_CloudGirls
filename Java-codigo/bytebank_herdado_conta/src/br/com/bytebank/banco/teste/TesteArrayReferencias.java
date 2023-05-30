package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayReferencias {

	public static void main(String[] args) {
	
		Object[]referencia = new Object[5];
		
		System.out.println(referencia.length);
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencia[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencia[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencia[2] = cliente;
				
		
		//System.out.println(cc1.getNumero());
		
//		Object refGenerica = contas[1];
//		System.out.println(refGenerica[1].getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencia[1];//type cast
		
		System.out.println(ref.getNumero());
	}

}
