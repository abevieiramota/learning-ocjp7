package br.abevieiramota.ocjp7;

public class Aula06 {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // StringBuilder/Buffer mutável
		System.out.println(sb.toString());
		sb = new StringBuffer("oi");
		System.out.println(sb.toString());
		sb.append(" tudo bem?");
		System.out.println(sb.toString());
		sb = new StringBuffer(50); // tamanho inicial, vazio
		System.out.println(sb.toString());
		System.out.println(sb); // samething
		sb = new StringBuffer("Oi");
		sb = new StringBuffer(sb);
		sb.append(" tudo bem???");
		System.out.println(sb);
		// StringBuffer x StringBuilder
		// Buffer = Builder + synchronization
		sb.append('c'); // char
		sb.append(sb); // StringBuilder/Buffer -> recebe object e chama toString
		sb.append(1);
		System.out.println(sb);
		sb.insert(3, ">>>>>>>>>><<<<<<<<<"); // insert
		System.out.println(sb);
		for(int i = 0; i < sb.length(); i++) {
			System.out.print(i);
		}
		System.out.println();
		sb.delete(3, 11); // delete de 3 a 8-1!!! do begin ao end - 1
		System.out.println(sb);
		sb = new StringBuffer("Abelardo");
		System.out.println(sb.reverse()); // reverse
		sb = new StringBuffer("   abelardo   ");
		System.out.println(sb.charAt(10));
		System.out.println(sb.indexOf("a"));
		System.out.println(sb.lastIndexOf("a"));
		System.out.println(sb.substring(5, 7));// não altera o sb
		// substring
		// subSequence <<<<<<<<< cuidado com os cases!
	}
}
