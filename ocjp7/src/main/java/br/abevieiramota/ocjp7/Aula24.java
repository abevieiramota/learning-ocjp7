package br.abevieiramota.ocjp7;

import java.util.ArrayList;
import java.util.Arrays;

public class Aula24 {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		// adiciona ao final
		nomes.add("Abelardo Vieira Mota");
		nomes.add("Bereu");
		nomes.add("Josino Bereta");
		
		System.out.println(nomes.contains("Abelardo Vieira Mota"));
		
		boolean removido = nomes.remove("Bereu");
		
		System.out.println(removido);
		System.out.println(nomes.contains("Bereu"));
		
		nomes.add("Josino Bereta");
		
		nomes.remove("Josino Bereta");
		
		// CUIDADO: REMOVE REMOVE APENAS A PRIMEIRA OCORRÊNCIA
		System.out.println(nomes.contains("Josino Bereta"));
		
		System.out.println(nomes.size());
		
		System.out.println(Arrays.toString(nomes.toArray(new String[nomes.size()])));
		
		// se o array passado não tem tamanho suficiente, é criado um novo 
		// array, do mesmo tipo, com o tamanho da list
		System.out.println(nomes.toArray(new String[0]));
		
		ArrayList<String> paises = new ArrayList<>();
		
		paises.add("Brasil");
		paises.add("França");
		
		ArrayList<String> tudo = new ArrayList<>();
		
		tudo.addAll(nomes);
		tudo.addAll(paises);
		
		System.out.println(tudo);
		
		System.out.println(nomes.get(0));
		
		nomes.add(0, "Fulano");
		
		System.out.println(nomes);
		
		// o ix deve ser entre [0, size-1]
		// nomes.add(10, "Hehe");
		
		nomes.remove(0);
		
		System.out.println(nomes);
		
		// troca elementos
		nomes.set(0, "Sicrano");
		nomes.add("Sicrano");
		
		System.out.println(nomes);
		
		int indexOf = nomes.indexOf("Sicrano");
		int lastIndexOf = nomes.lastIndexOf("Sicrano");
		
		System.out.println("First indexOf: " + indexOf);
		System.out.println("Last indexOf: " + lastIndexOf);
		System.out.println("IndexOf não existente: " + nomes.indexOf("ahsuahushu"));
	}
}
