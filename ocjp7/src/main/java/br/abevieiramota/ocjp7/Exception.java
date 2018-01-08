package br.abevieiramota.ocjp7;

public class Exception {

	/*
	 * It's illegal to use a try clause without either a catch clause or a finally clause
	 */
	
	/*
	 * Object -> Throwable \
	 *                      > Error
	 *                      > Exception \
	 *                      	   	     > RuntimeException
	 */
	
	/*
	 * The handler for the most specific exception must always be placed above those for more general exceptions
	 */
	
	static class Excecao extends java.lang.Exception {}
	static class SuperExcecao extends Excecao {}
	
	static void lancaSuperExcecao() throws SuperExcecao {
		throw new SuperExcecao();
	}
	
	public static void main(String[] args) {
		try {
			lancaSuperExcecao();
		} catch(Excecao ex) {
			System.out.println("Excecao");
		}
		/*
		 * catch inválido(compilation error) porque é de uma exceção subclasse de uma exceção já capturada!
		 */
//		catch(SuperExcecao ex) { 
//			System.out.println("SuperExcecao");
//		}
	}
}
