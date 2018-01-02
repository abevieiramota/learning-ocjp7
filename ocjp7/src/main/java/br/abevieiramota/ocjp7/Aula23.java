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
		
		int[] oi = new int[10];
		// compilation error! interpreta como assignment
//		oi[12];
		// runtime exception! acesso a posição inválida 
//		oi[12] = 20;
		
		// !! ver melhor tamanhos de arrays -> precisar ser quadrado?!
		int[][] arr2 = {{1, 2}, {3, 4}, {5}};
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("Dim " + i + " length " + arr2[i].length);
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		
//		Primitive array can accept any value that can be promoted implicitly to the declared type of the array
		int[] arrx = new int[3];
		arrx[0] = (byte) 4;
		arrx[1] = 'c';
		arrx[2] = (short) 3;

		char[] charr = new char[3];
		// COMPILATION ERROR
//		int[] arry = charr;
		By[] bs = new By[2];
		Ay[] as = bs; // OK
		bs = new By[1000]; // !!!!!!!!!!!!! OK -> tamanho não é declarado no ponteiro!
	}
	
	static class By extends Ay {}
	static class Ay {}
}
