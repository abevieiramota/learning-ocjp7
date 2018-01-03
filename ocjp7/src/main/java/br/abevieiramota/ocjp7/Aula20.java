package br.abevieiramota.ocjp7;

public class Aula20 {

	public static void main(String[] args) {
		int opcao = 4;

		// :OOO
		// na hora q entra num case, ele sai executando tudo que tem pela frente
		// até encontrar um break!!!!!!!!!!!!!!
		// independente de se os cases batem com o valor
		// :OOO
		switch (opcao) { // expression(o que vai no switch) -> char, byte, short, int, enum, String; 
		//                  constant(o que vai nos cases) -> literal or !!!!!!!! final variable initialized in declaration !!!!!!!!!
		
		// a avaliação dos cases é de cima para baixo
		case 2:
			System.out.println("oi");
			break;
		case 1:
			System.out.println("hehe");
		case 10:
			System.out.println("olá");
		case (4):
			System.out.println("hehe");
		case 23 - 16:
			System.out.println("sim");
			// n pode case variável não final
			// final pode
		default:
			// default só vai ser executado se nenhum bater
			// não importa onde esteja localizado!
			System.out.println("nada");
		case 7777:
			System.out.println("ooooooooooooia");
		case 666:
			// case vazio
//		case 666: !! NÃO PERMITIDO CASE REPETIDO
		}
		
		/*
		 * uso de final no case deve ser de variável inicializada na declaração COM LITERAL OU CONSTANTE!!
		 */
		final int b;
		b = 10;
		switch(opcao) {
		// compile error
//		case b: System.out.println("oi");
		}
		boolean x = false;
		final int c = x ? 10: 20;
		switch(opcao) {
		// COMPILE ERROR
//		case c: System.out.println("oi");
		}
		final int d = 20;
		switch(opcao) {
		// OK
			case d: System.out.println("oi");
		}
		

		// N PODE SWITCH DE FLOAT/DOUBLE

		System.out.println("-----------");
		int a = 10;
		switch (a) {
		case 10:
			System.out.println("case");
		default:
			System.out.println("default");
		}
		System.out.println("-----------");
		switch (a) {
		default:
			System.out.println("default");
		case 10:
			System.out.println("case");
		}

		switch (10) {
		case 10:
			System.out.println(10);
		}

		switch ("oi") {
		case "oi":
			System.out.println("oi");
		}
		
		// a constant(valor do case) deve pertencer ao range do tipo do switch
		byte a1 = 3, b1 = 2;
		switch(a1 + b1) { // byte + byte = integer
			case 128: System.out.println("oi");
		}
		switch(a1) { // byte = byte -> 128 n cabe em byte -> COMPILE ERROR
//			case 128: System.out.println("oooi");
		}
		
		System.out.println("LÁ VEM EXPERIMENTO");
		/*
		 * !!!!!!!!!! imprime 
		 * default
		 * 3 
		 * 4
		 */
		int k = 7;
		switch (k) {
		case 2:
			System.out.println("2 ");
		default:
			System.out.println("default ");
		case 3:
			System.out.println("3 ");
		case 4:
			System.out.println("4 ");
		}
	}
}
