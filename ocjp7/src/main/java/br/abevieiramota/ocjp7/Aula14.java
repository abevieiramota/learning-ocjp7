package br.abevieiramota.ocjp7;

public class Aula14 {

	public static void main(String[] args) {
		double d = 15.3;
//		int i = d; NÃO PODE - PERDA DE INFORMAÇÃO
//		System.out.println(i);
		// SÓ PODE SE NÃO FOR PERDER INFORMAÇÃO
		int i = (int) d; // explicitamente assume que quer perder informação OK
		System.out.println(i);
		// ponto-flutuante para inteiro -> PERDE O DECIMAL
		long l = 151515151515l;
//		int g = l; NÃO CABE
		int g = (int) l; // estourou!
		System.out.println(g);
		
		int x = 200;
		byte y = (byte) x;
		System.out.println(y);
		
		short m = 20;
//		char c = m; NÃO COMPILA!!!!!!!!!!!
//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		char c = (char) m;
		
		// DIVISÃO INTEIRA, DEPOIS É FEITO CAST
		// PERDE O DECIMAL!!!!!!!!!!!!
		double k = 3/2;
		System.out.println(k);
		
		// NÃO COMPILA! DEFAULT É DOUBLE, TEM QUE ESPECIFICAR FLOAT
//		float f = 0.0;
		float f = 0.0F;
		
//		System.out.println(3 / 0);
		System.out.println(3 / 0.0);
		System.out.println(3.0 / 0);
		System.out.println(-3.0 / 0);
		
		int z;
		for(int u = 0; u < 10; ++u) {
			z = u % 5 + 2;
		}
//		System.out.println(z);  COMPILADOR N SABE SE Z FOI INICIALIZADO!!!
		int _ = 10;
		
		// OPERAÇÕES NUMÉRICAS PRODUZEM NO MÍNIMO INT!!
		byte b1 = 5;
		byte b2 = 3;
//		byte b3 = b1 + b2;
//		System.out.println(b3);
		
//		 byte [-128, 127]
//		byte b4 = 128;
		
		char p = 10;
		// TYPE MISMATCH
//		char p2 = 10 - 20;
		int x1 = 10;
		int x2 = 20;
//		char p2 = x1 - x2;
		
		// divisão por zero em inteiro compila, mas lança exception!
//		Oi Erick,
//		Parte do código compila porque 65 é um valor que cabe num byte.. Você ta fazendo uma operação entre 2 valores final e é garantido que o resultado cabe.
//		Já na segunda parte você poderia ter um byte com 70 e outro com 70, que já ia estourar o valor, por isso que ele não deixa compilar. Nesse mesmo exemplo, se vc colocar final no b1 e b2, vai compilar.. Pq aí ele já resolve os valores na compilação.
		
		final int u1 = 10;
		final int u2 = 20;
		char p2 = u2 - u1;
//		char p2 = x2 - x1; NÃO PODE, VARIÁVEIS NÃO FINAIS!
		
	}
}
