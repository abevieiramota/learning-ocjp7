class A {
	void doStuff() throws Exception {
		System.out.println("do stuff");
	}

	public static void main(String[] args) throws Exception {
		new A().doStuff();

		try {
			new A().doStuff();
		} catch(MinhaExcecao e) {
			System.out.println("catchei");
		}
	}
}

class MinhaExcecao extends Exception {
}