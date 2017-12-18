package br.abevieiramota.ocjp7;

import org.junit.Test;

public class Phrases {
	
	int Polymorphism;
	/**
	 * "a reference variable can be of only one type, and once declared, that type can never be changed"
	 * "at runtime, the only things that are dynamically selected based on the actual object(rather than the reference type) are instance methods"
	 */
	
	int overriding, overloading;
	/**
	 * Rules of overriding
	 * 	same name and argument list
	 * 	return type must be the same as, or a subtype of, the return type
	 * 	access level can't be more restrictive, but can be less restrictive
	 * 	final or private cannot be overriden
	 * 	!!!!! default methods can't be overriden by classes outside its package > ver br.abevieiramota.ocjp7.hehe1
	 * 	pode lançar qualquer runtime exception, independente do método sobrescrito
	 * 	não pode lançar mais checked exception que o sobrescrito -> mais = mais amplas ou outras
	 * 	pode lançar menos checked exception que o sobrescrito -> menos = mais específica ou menos
	 * 	não pode sobrescrever static
	 * 	
	 * "you can use super only to access a method in a class' superclass, not the superclass of the superclass - that is, you can't say super.super.doStuff()"
	 * 
	 * Rules of overloading
	 * 	change argument list
	 * 	can change return type
	 * 	can change access modifier
	 * 	can declare new or broader checked exceptions
	 */
	
	int implementing, an, _interface;
	
	/**
	 * "interface can extend another interface, but it can never implement anything"
	 * class A extends B implements C - a ordem é [EXTENDS, IMPLEMENTS]
	 */
	
	int legal, return_, types;
	
	/**
	 * "In a method with a primitive return type, you can return any value or variable that can be implicitly converted to the declared type"
	 */
	int retornaInt() { return 'c'; } // char é 16 bits unsigned

	void shortNPegaChar() {
		char c = 1234;
//		short a = c;// !!!! SHORT N PODE RECEBER VALOR EM VARIÁVEL CHAR
		short a = 'c'; // MAS PODE RECEBER LITERAL CHAR -> os literais cabem no short, que é signed -> lembrar que signed tem range positivo metade do range positivo do unsigned
	}
	
	int constructors, instantiation;
	
	/**
	 * "you cannot make a new object without invoking(...) the constructor of the object's actual type(...) and of each of its superclasses"
	 * todo construtor chama, implicitamente, o construtor de sua superclasse
	 * compilador adiciona um construtor default sse não for declarado construtor na classe
	 * todo construtor tem, no seu início, ou uma chamada explícita a this(), ou uma chamada explícita a um construtor de supreclasse ou uma chamada implícita a super()
	 * "you cannot make a call to an instance method or access an instance variable until after the super constructor runs"
	 * "only static variables and methods can be accessed as part of the call to super() or this()"
	 * "abstract classes have constructors, and those constructors are always called where a concrete subclass is instantiated"
	 * construtor default não tem argumentos, possui mesmo modificador de acesso da classe e faz uma chamada ao construtor sem argumentos da superclasse
	 * 	se a class é public -> construtor é public; se a classe é default -> construtor é default
	 * static initialization block é chamado quando a classe é carregada, na ordem em que são declarados
	 * instance initialization block é chamado após a chamada a super do construtor, quando um objeto é instanciado, na ordem em que são declarados > ver Initialization.java
	 * !!!!!!!!!!!!!!runtime exceptions lançadas em blocos STATIC de inicialização lançam ExceptionInInitializationException
	 * 	em blocos de instância lançam a própria exception
	 */

	static class A {
		A(int b) {
		}
	};

	static class B extends A {
		B() {
			/** NÃO PODE CHAMAR MÉTODO OU VARIÁVEL DE INSTÂNCIA ANTES DA CHAMADA A SUPER OU THIS */
//			super(doSomething()); 
			super(doStuff());
		}

		int doSomething() {
			return 10;
		}
		
		static int doStuff() {
			return 10;
		}
	};
	
	int statics;
	
	/**
	 * "the Java language also allows you to use an object reference variable to access static member"
	 * métodos estáticos não podem ser sobrescritos, mas podem ser redefinidos
	 */
	
	static class C {
		static int a = 10;
		{
			this.a = 20;
			C.a = 30;
		}
	}
	
	static class D extends C {
		static int a = 20;
		{
			this.a = super.a;
			System.out.println(this.a);
		}
	}
	
	@Test
	public void oi() {
		new D();
	}

}
