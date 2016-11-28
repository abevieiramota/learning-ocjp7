package br.abevieiramota.ocjp7;

public class Aula20 {

	public static void main(String[] args) {
		int opcao = 4;

		// :OOO
		// na hora q entra num case, ele sai executando tudo que tem pela frente
		// até encontrar um break!!!!!!!!!!!!!!
		// independente de se os cases batem com o valor
		// :OOO
		switch (opcao) {
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
	}
}
