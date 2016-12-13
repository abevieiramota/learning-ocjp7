class A {
	A() {
		doStuff();
		//super(); não pode acessar instância antes do super
	}

	void doStuff(){};
}

class ConstrutorCallInstance {
	public static void main(String[] args) {
		new A();
	}
}