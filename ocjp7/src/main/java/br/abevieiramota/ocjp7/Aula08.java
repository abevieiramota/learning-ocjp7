package br.abevieiramota.ocjp7;

public class Aula08 {

	public static void main(String[] args) {
		// atribuição, direito deve ser menos específico que o da esquerda
		// byte, short, int, long
		// char tem mesmo tamanho de short, mas só pode positivo
		// float, double
		// todos inteiros cabem em float
		// se valor fora dos limites do tipo, não compila!
		// char pode converter para int e long
		char x = 100;
		char b = (char) 70000;
		System.out.println((int) b); // 4464
//		short b = x;
	}
}
