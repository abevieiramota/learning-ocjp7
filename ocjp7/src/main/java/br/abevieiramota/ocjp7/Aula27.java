package br.abevieiramota.ocjp7;

import java.util.Arrays;

public class Aula27 {
	public static void main(String[] args) {
		// incrementa, depois testa
		// todas as partes do for são opcionais
		// só pode definir um tipo

		// ou declara e inicializa tudo
		// ou só inicializa tudo
		
		// só pode definir um tipo!!!!
		// n pode for(int i = 0, int j = 10 ...
		for (int i = 0, j = 10; i < 10 && j > 0; i++, j--, System.out.print("oi")) {
			System.out.println(i + " " + j);
		}
		// um for eterno, compilador percebe e
		// dá erro se houver código depois

		int i = 0;
		for (System.out.print("inicializa "); teste(); System.out.print("incremento")) {
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
	}

	private static boolean teste() {
		System.out.print("teste ");

		return true;
	}
}
