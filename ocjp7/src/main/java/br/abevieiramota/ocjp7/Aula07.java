package br.abevieiramota.ocjp7;

public class Aula07 {
	
	static class OiPaizao {
		@Override
		public String toString() {
			return "Oi Paizão";
		}
	}

	public static void main(String[] args) {
		/*
		 * um objeto -> a
		 */
		String a = "oi";
		/*
		 * dois objetos -> 'oi' e b
		 */
		String b = new String("oi");
		String c = new String(new char[]{'a', 'b'});
		String d = new String(new StringBuilder("abelardo"));
		String e = null;
		String f = "a" + "b"; // se concatenar um null -> concatena a string "null"
		String g = "a" + 1500; // concatena "1500"
		String h = 15 + 00 + "a"; // + é da esquerda pra direita
		// string é imutável!!!!!!! os métodos retornam um novo valor, n alteram inplace
		// charAt posição inválida StringIndexOutOfBoundException
		System.out.println(h.length()); // length() método
		h.isEmpty(); // 0 caracteres
		// trim() -> remove espaços dos dois lados
		// replace()
		// method chain
		// substring
		h.equalsIgnoreCase(h);// equalsIgnoreCase()
		// compareTo()
		// indexOf() -> primeira ocorrência -1 se n encontra
		// lastIndexOf() -> última ocorrência -1 se n encontra
		// indexOf("oi", 7) -> a partir da posição 7, incluso
		// lastIndexOf("oi", 14) -> de trás pra frente, que comece em no máximo na posição 14
		
		String hello = "Hello.";
		/*
		 * chama toString
		 */
		hello += new OiPaizao();
		System.out.println(hello);
		
		/*
		 * equals e equalsIgnoreCase com null = false
		 */
		if("oi".equalsIgnoreCase(null)) {
			
		}
		
		// 12
		"0123456".substring(1, 3);
		
		// saias
		System.out.println(new StringBuilder().append("as").reverse().insert(2, "ias").toString());
	}
}
