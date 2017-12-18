package br.abevieiramota.ocjp7;

/**
 * Combinações inválidas:
 * 	* abstract final
 * 	* abstract static
 * 	* abstract private
 */
public abstract class Abstract {
	
	/**
	 * se possui um método abstract, deve ser abstract
	 */
	abstract void doSomething();
	
	/** deve implementar doSomething, ou declará-lo como abstract(sendo abstract portanto) */
	class NaoAbstract extends Abstract {
		
		void doSomething() {};
	}
}
