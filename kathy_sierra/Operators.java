class B extends A {}
class C {}
class A {
	public static void main(String[] args) {
		if(10.2f > 4L) {
			System.out.println("Olá");
		}

		if(new A() == new B()) {
			System.out.println("hhee");
		}

		if(new B() instanceof A) {
			System.out.println("ashuuahsu");
		}

		if((new B[10]) instanceof A[]) {
			System.out.println("auhshu1234");
		}

		System.out.println(12.3f % 3.1f);

		if(true ? true: false) {
			System.out.println("ternário não precisa ser em assignment");
		}

		if(10 < 3 ? false : true) {
			System.out.println("aushhuas!!!!!!!!!!!!!!");
		}

		if('a' > 3) {
			System.out.println("comparei char com int rs");
		}

		if('a' == 1) {
			System.out.println("olá");
		}

		/*
		não funciona > precisa ser referência
		if(1 instanceof Integer) {
			System.out.println("instanceof com autoboxing!");
		}
		*/

		true ? new A() : new B();
	}
}