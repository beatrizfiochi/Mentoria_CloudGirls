package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de Entrada com Arquivo 
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
		
		PrintWriter ps = new PrintWriter("lorem5.txt"); //PrintStream ps = new PrintStream("lorem5.txt");
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ");
		ps.println();
		ps.println();
		ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ");
		
		ps.close();
		
	}

}
