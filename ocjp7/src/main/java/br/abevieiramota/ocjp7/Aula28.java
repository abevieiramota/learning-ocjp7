package br.abevieiramota.ocjp7;

public class Aula28 {
	public static void main(String[] args) {
		int i = 20;
		while (i < 10) {
			System.out.println("i = " + i++);
		}

		int j = 20;
		// !!!!!!!! DO-WHILE não precisa de chaves!!!!
		do
			System.out.println("j = " + j++);
		// mais uma linha, dá erro de compilação!
		// System.out.println("auhshu");
		while (j < 10); // <<<<<<!!!!<<<<< ;

		do
			; while (j++ < 100);

		// sem vírgula(statement), n
		// do
		//    while (j++ < 100);
	}
}
