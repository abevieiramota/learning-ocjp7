package br.abevieiramota.ocjp7;

import java.io.Serializable;

public class Aula21 implements Serializable {

	public static void main(String[] args) {
		int[] idades;
		double pesos[];
		long[] numeros;
		long[] tamanhos; // <<<<<<<<<<<<<<<<<<<< :O

		// array é objeto
		idades = new int[10]; // necessário informar o size da primeira dimensão
		// inicia com valor default
		int[] arrNegativo = new int[-10]; // compila mas dá exceção de size negativo
		int[] jaInicializo = new int[] { 1, 2, 3 };
		int[] jaInicializo2 = { 1, 2, 3 }; // apenas se tudo estiver na mesma linha!!!
		// n pode declarar e depois inicializar assim
		//		idades = {1,2,3}; não compila
		// acessar uma posição inválida > compila, mas lança exception indexoutofboundexc

	}
}
