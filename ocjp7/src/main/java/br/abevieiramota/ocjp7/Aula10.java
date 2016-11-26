package br.abevieiramota.ocjp7;

public class Aula10 {

	public static void main(String[] args) {
		// numéricos podem ser comparados
		System.out.println(1 == 1);
		System.out.println(1 != 1);
		System.out.println(2 >= 1);
		System.out.println(2 <= 1);
		System.out.println(2 < 1);
		// tipos numéricos diferentes
		System.out.println(1 == 1.0);
		System.out.println(1 == 1.0D);
		System.out.println(1L == 1.0);
		// referência se é para o mesmo objeto
//		System.out.println(true == 1); NÃO PODE
		int idade = 25;
		System.out.println(idade = 30); // pegadinha -> atribui, e não verifica igualdade!
	}
}
