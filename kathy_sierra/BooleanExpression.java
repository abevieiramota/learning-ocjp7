class A {
	public static void main(String[] args) {
		boolean a = true, b = false;

		if(a && b || a && a) {
			System.out.println("oie");
		}

		if(a && (b || (a && a))) {
			System.out.println("oie");
		}
	}
}