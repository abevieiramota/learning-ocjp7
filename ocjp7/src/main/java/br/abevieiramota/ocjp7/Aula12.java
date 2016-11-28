package br.abevieiramota.ocjp7;

public class Aula12 {

	public static void main(String[] args) {
		int i = 5;
		System.out.println(i--);
		System.out.println(++i);
		i = i + 2;
		i -= 2; // também retorna!
		System.out.println(i+=10);
		
		byte b = 15;
		b += 3;
//		b = b + 3; // NÃO PODE, COMPILADOR NÃO SABE SE VIRAR
		b += 200;
		
		System.out.println(b); // o número roda
		
		i = 10;
		i += ++i + i + ++i; //  calcular da esquerda para a direita
//		i = i + ++i + i + ++i;
//		i = 10 + ++i + i + ++i;
//		i = 10 + 11 + i + ++i;
//		i = 10 + 11 + 11 + ++i;
//		i = 10 + 11 + 11 + 12;
//		i = 44;
		System.out.println(i);
		
		int a = 15, d = 20, c = 30;
		
		a = (c = d); // o resultado de uma atribuição é o valor atribuído
		System.out.println(a);
		a = c = d; // samething
		System.out.println(a);
	}
}
