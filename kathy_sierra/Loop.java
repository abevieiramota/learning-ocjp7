class A {
	public static void main(String[] args) throws Exception {
		boolean k = false;
		int i = 0;

		while(k = true) {
			System.out.println("caiu na pegadinha hein");
			if(i++ == 5) {
				break;
			}
		}

		int x;

		for(x = 0; x < 4; x++) {
			System.out.println("for sem declarar loop variable");
		}

		String oi;

		for(x = 0, oi = "Hehe"; x < 4; x++) {
			System.out.println("for inicializando duas variáveis de tipos diferentes");
		}

		for(int y = -1, l = y; ++y < 10; System.out.println("Loop estranho " + y)) {
		}

		char[] charArr = {'a', 'b'};

		for(int u: charArr) {
			System.out.println(u);
		}

		//for(short u: charArr) {
		//	System.out.println(u);
		//}

		int m = 0, n = 0;

		fora: for(; m < 10; m++, System.out.println("loop externo")) {
			for(; n < 10; n++, System.out.println("loop interno")) {
				continue fora;
			}
		}

		//outer: System.out.println("Olá");
		//for(int r = 0; r < 10; r++) {
		//	break outer;
		//}
	}
}