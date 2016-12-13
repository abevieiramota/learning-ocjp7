class A  {
	private static int daUmInt(int value) {
		System.out.println(value);

		return value;
	}

	int x = daUmInt(10);

	{
		x = daUmInt(20);
	}

	int z = daUmInt(30);

	A() {
		// depois do super implícito, executa as inicializações na ordem em que aparecem
		x = daUmInt(40);
	}

	public static void main(String[] args) {
		new A();
	}

}