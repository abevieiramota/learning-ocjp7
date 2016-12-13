class A {
	void doSomething() {
		System.out.println(super.toString());
	}
	public static void main(String[] args) {
		new A().doSomething();
	}
}