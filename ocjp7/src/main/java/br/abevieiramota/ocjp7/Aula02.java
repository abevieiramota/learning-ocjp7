package br.abevieiramota.ocjp7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

class NaoSouPublic {
}

/**
 * Interfaces não podem ter métodos:
 * 	* static
 * 	* final
 * 	* strictfp
 * 	* native 
 * 
 * Interface pode extender 0 ou mais interfaces
 */
interface INaoSouPublic {
	// !!!por padrão, variável é public static final
	final int TAMANHO = 5;
	// por padrão, o método é public abstract
	void autentica(String nome, String senha);
}

/**
 * Ordem do código no arquivo:
 * 
 * 1 - package(opcional); pode ter 0 ou 1; se não for declarado, package default
 * 2 - imports; pode ter 0 ou mais;
 * 3 - classes/interfaces; pode ter 0 ou mais; !!! pode ter um arquivo vazio!
 * * - comentários; em qualquer lugar; n pode aparecer dentro de identificadores!
 * 
 * !!!!! o arquivo deve estar em diretório com a estrutura do pacote
 */
@RunWith(JUnit4.class)
/**
 *	!! É permitido apenas uma classe public por arquivo.
 *	!! Se ela houver, deve ter o mesmo nome do arquivo. 
 */
public class Aula02 {

	static class Pessoa {
		
		static int Pessoa;
		/**
		 * variáveis
		 * construtores
		 * métodos
		 * 
		 * não há conflito entre nome de variável, classe, método
		 */
		
		/**
		 * mesmo nome da classe
		 * pode ter qualquer um dos modificadores de acesso
		 * não pode {static, final, abstract}
		 * não pode ter return não vazio
		 */
		Pessoa() { /** implicitamente retorna objeto da classe */
			return; /** construtor pode ter return vazio */
		}

		/** 
		 * 	Não é construtor!
		 *  pode ter return
		 */
		Pessoa Pessoa() {
			return new Pessoa();
		}
	}

	@Test
	public void test() {

	}
}
