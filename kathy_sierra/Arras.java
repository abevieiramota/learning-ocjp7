class A {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};

		arr = new int[] {1, 2, 3};

		// não pode! compilation error
		// arr = new short[] {1, 2, 3};

		// não pode! tem que ser do tipo!
		// Integer[] arrInteger = new Short[] {1, 2, 3};

		// refs pode!
		A[] arrRef = new B[] { new B(), new B()};
	}
}

class C extends A {}