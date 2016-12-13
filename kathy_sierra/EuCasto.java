class A {
	public static void main(String[] args) {
		char c = (char) 700123;
		char d = 'a';

		int l = (char) 700123;

		byte a = 1 + 20;
		// não permite
		// byte b = 20;
		// byte a = 1 + b;

		int k = 10, b = k + 1;

		short f = 20;
		int x2 = f;
		// não permite
		// f = x2;

		float g = 234.56f;
		short s = (short) g;

		// compound tem cast implícito

		short kk = 1;
		kk += 10; // faz implicitamente cast de int(kk + 10) em short
		// tomar cuidado, pode extrapolar o limite do tipo...

		System.out.println(c + " " + d + " " + l);
		System.out.println(s);
		System.out.println(kk);
	}
}