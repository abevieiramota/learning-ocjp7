package br.abevieiramota.ocjp7;

import java.util.Arrays;

public class Aula27 {
	public static void main(String[] args) {
		// incrementa, depois testa
		// todas as partes do for são opcionais

		// ou declara e inicializa tudo
		// ou só inicializa tudo
		
		// !! só pode declarar de um tipo!!!!
		// n pode for(int i = 0, int j = 10 ...
		for (int i = 0, j = 10; i < 10 && j > 0; i++, j--, System.out.print("oi")) {
			System.out.println(i + " " + j);
		}
		// sendo declarado antes, pode atribuir a vários tipos
		char c;
		int a;
		for(a = 1, c = 'c';;) {break;}
		// um for eterno, compilador percebe e
		// dá erro se houver código depois
		// condição ausente = true
//		for(;;) -- loop infinito
		

		int i = 0;
		// o iteration pode ser qualquer sequência de statements separada por vírgula(?)
		for (System.out.print("inicializa "); teste(); System.out.print("incremento"), System.out.println("oi")) {
			System.out.println();
			if (i++ > 10) {
				break;
			}
		}

		for (String nome : Arrays.asList("Abelardo", "Dardo")) {
			System.out.println(nome);
		}

		// NÃO COMPILA
		// TRECHO NÃO ALCANÇÁVEL
		//		for(;false;) {
		//			
		//		}
		
		/*
		 * Labeled continue and break statements must be inside the loop that has the same label name, otherwise, the code will not compile.
		 */
		System.out.println("antes");
		fora: for (int x = 0; x < 1; x++, System.out.println("primeiro for")) {
			System.out.println("primeiro bloco");
			for (;; System.out.println("segundo for")) {
				continue fora; // executa o iteration code do primeiro for!
			}
		}
	}

	private static boolean teste() {
		System.out.print("teste ");

		return true;
	}
}
