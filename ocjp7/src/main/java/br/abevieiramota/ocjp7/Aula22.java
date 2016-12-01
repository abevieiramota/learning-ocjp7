package br.abevieiramota.ocjp7;

class Monstro {
	String nome;
	
	@Override
	public String toString() {
		return this.nome;
	}
}

class MonstroDoMal extends Monstro {
	
}

public class Aula22 {

	public static void main(String[] args) {
		int[] x = new int[0];
		Monstro[] monstros = new Monstro[10]; // valor default = null
		for (int i = 0; i < monstros.length; i++) {
			monstros[i] = new Monstro();
			monstros[i].nome = "Abelardo" + i;
		}
		
		for (Monstro monstro : monstros) {
			System.out.println(monstro);
		}
		
		monstros[5] = new MonstroDoMal();
		
		int[] ints = new int[10];
//		long[] longs = ints; NÃO PODE
//		long[] longs = (long[]) ints; NÃO PODE
		// array de referência, pode fazer o cast
		// se forem compatíveis
		MonstroDoMal[] monstrosDoMal = new MonstroDoMal[10];
		monstrosDoMal[1] = new MonstroDoMal();
		monstrosDoMal[1].nome = "bilila";
		monstros = monstrosDoMal;
		
		for (MonstroDoMal monstroDoMal : monstrosDoMal) {
			System.out.println(monstroDoMal);
		}
	}
}
