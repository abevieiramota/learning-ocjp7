package br.abevieiramota.ocjp7;

public class Casting {

	class A {}
	class B extends A {}
	class C {
		// static can only be declared in a top class or in a static class!!!!!!!!!!!!
		public void main(String[] args) {
			A a = new A();
			/**
			 * se faz parte da árvore de herança, compila mas dá runtime error
			 */
			B b = (B) a; // !!! RUNTIME ERROR
//			C c = (C) a; // !!! COMPILATION ERROR
			A d = new B(); // upcasting works implicitly
		}
	}
	
	public static void main(String[] args) {
		new Casting().new C().main(null);
	}
}
