package br.abevieiramota.ocjp7;

public class Aula15 {

	public static void main(String[] args) {
		int a = 15 * 4 + 1;
		int b = 1 + 15 * 4;
		System.out.println(a == b);
		int c = 15 * (4 + 1);
		System.out.println(a + " " + c);
		// concat e soma > mesma precedência!!!!!!!!!!!
		System.out.println(a + c + " aoisasio");
		System.out.println("ahusshua " + a + c);
		System.out.println("oi" + "ooi".length());
	}
}
