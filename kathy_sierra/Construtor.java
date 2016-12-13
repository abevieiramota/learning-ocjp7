class A {
	static String getName() {
		return "A";
	}
	A() {
		System.out.println(this.getName());
	}
	String A() {
		return "Hehe";
	}
}

class B extends A {
	B() {
		System.out.println("B");
	}
}

class Construtor {
	public static void main(String[] args) {
		new B();
	}
}