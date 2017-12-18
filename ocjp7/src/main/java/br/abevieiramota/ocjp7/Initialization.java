package br.abevieiramota.ocjp7;

import org.junit.Test;

public class Initialization {

	static class B {
		static {
			System.out.println("static1");
		}

		static {
			System.out.println("static2");
		}

		{
			System.out.println("instance1");
		}

		{
			System.out.println("instance2");
		}
		
		{
			int i = 1/0;
		}
		
		static {
			System.out.println("static3");
		}
		
		static {
			int i = 1/0;
		}

		public B() {
			System.out.println("constructor");
		}
	}

	@Test
	public void test() {
		new B();
	}

}
