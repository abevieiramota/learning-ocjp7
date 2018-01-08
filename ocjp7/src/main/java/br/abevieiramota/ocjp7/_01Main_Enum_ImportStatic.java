package br.abevieiramota.ocjp7;

/**
 * [FIXME] import static org.junit.Assert.assertEquals;
 * é inválido
 * 	   static import org.junit.Assert.assertEquals;
 */
import static org.junit.Assert.assertEquals;

/**
 * !!!!! Import com * import apenas as classes no nível do import, e não também as dos subpackages
 * import org.junit.*
 * irá importar apenas as classes diretamente abaixo de org.junit
 * não importará, por exemplo, org.junit.runner.RunWith
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/*
 * an object is eligible for garbage collection when no live thread can access it
 */
@RunWith(JUnit4.class)
public class _01Main_Enum_ImportStatic {
	String nome = "tsc";

	/**
	 * não é permitido nomear variável de instância e static com mesmo nome
	 */
//	static String nome;
	
	@Test
	public void test() {
		// shadowing -> 'nome' passa a referenciar a variável local -> this.nome para referenciar a variável de instância
		String nome = "oi";
		
		assertEquals("oi", nome);
		assertEquals("tsc", this.nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
	public void setIdade(int nome) {
		this.nome = Integer.toString(nome, 2);
	}

	/**
	 * Declarações possíveis do main 
	 */
//	static public void main(String[] args)
//	public static void main(String... args)
//	public static void main(String args[])
//	public static void main(String [] args)
//	public static void main(String ... args)
	public static void main(String[] args) {
		/*
		 * !!! apesar da identação, o else é do if mais interno!
		 */
		if(true)
			if(false)
				System.out.println("false");
		else System.out.println("true");
	}
	
	/** vararg deve ser o último parâmetro
	 *	só pode haver um vararg por método 
	 */
	void doAlgumaCoisa(int a, int b, int... c) {}

	enum A {B, C}
	// ; necessário apenas se tem código depois
	enum B {C, D; public void doSomething() {}}
	
	enum C {
		// elementos primeiro
		E { void doStuff() {}};
		// abstract method
		abstract void doStuff();
	}
	
	enum D {
		A { void doStuff() {}};
		void doStuff() {};
	}
	
	enum E {
		A;
		void doStuff() {};
	}
}
