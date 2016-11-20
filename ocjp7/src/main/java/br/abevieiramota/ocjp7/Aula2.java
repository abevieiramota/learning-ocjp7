package br.abevieiramota.ocjp7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

class NaoSouPublic {
}

interface INaoSouPublic {
	// !!!por padrão, variável é final e estática e pública
	final int TAMANHO = 5;
	// por padrão, o método é abstract e público
	void autentica(String nome, String senha);
}

/*
 * 1 - (opcional) package < apenas 1 - sem pacote -> pacote default
 * 2 - (opcional) imports < n
 * ~ classes/interfaces <<<< opcional!!! pode ter um arquivo vazio!
 * comentários em qualquer lugar - n pode aparecer dentro de identificadores!
 * 
 * 
 * arquivo deve estar em diretório com estrutura do pacote
 */
@RunWith(JUnit4.class)
// apenas um public, com mesmo nome do arquivo
public class Aula2 {

	static class Pessoa {
		
		static int oi;
		/*
		 * variáveis
		 * construtores
		 * métodos
		 * 
		 * não há conflito entre nome de variável, classe, método
		 */
		
		Pessoa() { // implicitamente retorna objeto da classe
			return; // construtor pode ter return vazio
		}

		// NÃO É CONSTRUTOR - RETURN
		void Pessoa() {
			return;
		}
	}

	@Test
	public void test() {

	}
}
