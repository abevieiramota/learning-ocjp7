package br.abevieiramota.ocjp7;

public class Aula13 {
	
	static class A {
		
	}
	
	static class B extends A {
		
	}

	public static void main(String[] args) {
		boolean a = true, b = false, c = true, d = false;
		/*
		 * a avaliação é da esquerda para a direita
		 * 	primeiro operando && avaliação do resto
		 * 						 primeiro operando | avaliação do resto
		 * 						 (etc)
		 */
		System.out.println(a && b || c && d);
		System.out.println(a && (b || (c && d)));
		int i = 5;
		boolean v = i == 5 ? true : false;
		System.out.println(v);
		
		A au = i == 5 ? new A() : new B();
		
		String x = "oi" + "oi"; // String possui operador de soma definido

		/*
		 * não é y = (y*2) + 5
		 * mas   y = y * (2 + 5)
		 * o que está a direita do operador composto tem precedência!
		 */
		int y = 10;
		y *= 2 + 5;
	}
}
