package br.abevieiramota.ocjp7;

public class Aula13 {
	
	static class A {
		
	}
	
	static class B extends A {
		
	}

	public static void main(String[] args) {
		int i = 5;
		boolean v = i == 5 ? true : false;
		System.out.println(v);
		
		A a = i == 5 ? new A() : new B();
		
		String x = "oi" + "oi"; // String possui operador de soma definido
	}
}
