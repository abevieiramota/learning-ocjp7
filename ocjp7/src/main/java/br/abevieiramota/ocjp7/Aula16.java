package br.abevieiramota.ocjp7;

public class Aula16 {

	public static void main(String[] args) {
		String nome1 = "Abelardo";
		String nome2 = "Abelardo";
		
		String nome3 = new String("Abelardo");
		String nome4 = new String("Abelardo");
		
		// JAVA TENTA REUTILIZAR STRINGS
		// APENAS QUANDO LITERAL!!!!!!!!!!!!!!!!
		System.out.println(nome1 == nome2);
		System.out.println(nome3 == nome4);
		System.out.println(nome1 == nome3);
		System.out.println(nome1.equals(nome3));
	}
}
