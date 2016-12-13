package br.abevieiramota.ocjp7;

public class Aula26 {

	public static void main(String[] args) {
		int x = 10;

		// como não é final, o compilador não verifica se x é igual a 10 sempre ali(para isso, teria que executar o código)
		// dessa forma, permite compilar
		// se for final, n
		while (x == 10) {

		}

		x += 10;
		
		final int y = 10;
		
//		while(y == 10) {
//			
//		}

		while (true) {

		}

		// unreachable
		//		x += 10;
	}
}
