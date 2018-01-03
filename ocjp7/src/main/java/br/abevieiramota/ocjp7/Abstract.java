package br.abevieiramota.ocjp7;

/*
 * java 8: interfaces can have static
 */
interface Hehe {
	static int num = 0;

	static void doSomething() {
	};
	
	default void oi() {
		System.out.println("oi");
	}
}

class HeheImpl implements Hehe {
	
	/*
	 * !!!! tem que ter o public, porque implementa e não pode reduzir visibilidade(interface methods are public)
	 */
	public void oi() {
		System.out.println("hehe");
	}
}

class Hoho implements Hehe {
}
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
