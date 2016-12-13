class A {
	int x;
	static int y;

	{
		x = 10;
	}

	void doAlgo(String x, Object y) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		new A().doAlgo("OI", "Tudo Bem");
	}
}