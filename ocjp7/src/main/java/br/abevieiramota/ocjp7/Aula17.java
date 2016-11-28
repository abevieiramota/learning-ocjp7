package br.abevieiramota.ocjp7;

public class Aula17 {

	public static void main(String[] args) {
		// concatenação de 2 literais é outro literal!
		String ab = "a" + "b";
		
		System.out.println(ab == "ab");
		
		// concatenação de variável e literal não é literal!
		String a = "a";
		String ab2 = a + "b";
		
		System.out.println(ab2 == "ab");
		
		// QUANDO O RETORNO É DIFERENTE DA STRING, RETORNA NOVO OBJETO E NÃO
		// GERENCIA VIA POOL
		String texto = "um texto qualquer";
		
		String txt = texto.substring(3, 8);
		System.out.println(txt == "texto");
		
		// QUANDO O RETORNO É IGUAL, RETORNA O MESMO OBJETO!
		String texto2 = texto.substring(0, texto.length());
		
		System.out.println(texto == texto2);
		System.out.println(texto == texto.toLowerCase());
		System.out.println(texto == texto.toString());
		
		
		{
			// SÃO CRIADAS 2 STRINGS AQUI!!!!!!!!!!!!
			// APENAS O LITERAL FOI PRO POOL DE STRING
			String h = new String("hello ");
			String h1 = "hello ";
			String w = "world";
			
			System.out.println("hello ");
			System.out.println(h1 + "world");
			System.out.println("Hello " == h1);
		}
		
		{
			String h = new String("hello world").intern();
			
			System.out.println(h == "hello world");
		}
	}
}
