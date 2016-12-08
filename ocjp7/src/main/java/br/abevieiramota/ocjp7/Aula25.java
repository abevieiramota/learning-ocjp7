package br.abevieiramota.ocjp7;

import java.util.ArrayList;
import java.util.Iterator;

public class Aula25 {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Java");
		nomes.add("Ruby");
		nomes.add("C#");

		Iterator<String> it = nomes.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			if (!it.hasNext()) {
				it.remove();
			}
		}

		System.out.println(nomes.size());
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
		
		// contains, indexOf -> equals!!!!
		
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add(0, "aois");
		// cuidado! add com index pode adicionar ou no range da lista ou na 
		// proxima posição
		lista.add(1, "uhuas");
		
		lista.add(2, "teste");
	}
}
