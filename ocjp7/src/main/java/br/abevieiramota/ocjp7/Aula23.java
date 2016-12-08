package br.abevieiramota.ocjp7;

public class Aula23 {

	public static void main(String[] args) {
		int[][] cubo;
		int[][] tabela[]; // <<<<<<<<<<<<<
		int[][] hipercubo[][];
		int[] []arr[];
		arr = new int[10][20][5];
		
		cubo = new int[10][]; // << necessário que apenas a primeira dimensão seja inicializada
		
		tabela = new int[][][] {{{1,2}}};
		
		hipercubo = new int[10][][][];
		hipercubo[0] = new int[5][][];
		hipercubo[0][0] = new int[3][];
		hipercubo[0][0][0] = new int[2];
		hipercubo[0][0][0][0] = 123;
		
		// NA CRIAÇÃO, EU INDICO O TAMANHO DOS ARRAYS DAS DEMAIS DIMENSÕES
		// MAS ISSO NÃO IMPEDE DE MUDAR ESSES ARRAYS PARA ARRAYS DE TAMANHOS DIFERENTES!
		int caixa[][] = new int[2][3];
		int caixote[] = new int[10];
		
		caixa[0] = caixote;
		
		System.out.println(caixa[0][4]);
	}
}
