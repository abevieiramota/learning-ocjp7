package br.abevieiramota.ocjp7;

class Pessoa {
	String nome;
	
	public String getNome() {
		return this.nome;
	}
	
	// varargs
	// 0 a infinito argumentos
	// não pode misturar varargs de vários tipos
	// ex 1 a 3 int, 4 a 10 floats < NO
	// varargs tem que ser o ÚLTIMO argumento
	// se soma(String nome, int... valores), é obrigatório o nome!
	public int soma(int... valores) {
		int soma = 0;
		for(int valor: valores) {
			soma += valor;
		}
		
		return soma;
	}
	
	// ordem de definição de métodos não importa!
	// sempre executa o mais específico
	// soma() chama o soma sem argumentos!
	public int soma() {
		return 10;
	}
	
	public int soma(int a) {
		return a + 5;
	}
}

public class Aula05 {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.getNome(); // n precisa usar o retorno!
		p.soma(new int[]{1,2,3,4}); // vargars -> array ou varargs, array só array!
		System.out.println(p.soma());
		System.out.println(p.soma(10));
	}
}
