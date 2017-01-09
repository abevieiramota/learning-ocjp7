package package1;

import static java.lang.Integer.*;
import static java.lang.Integer.MAX_VALUE;

class C {
	protected int x = 12;
	private int[    ]arr;
	public static void main(String ... args) {
		new N();
	}
}

strictfp interface a {}

public class A {
	protected int x;
	void hehe(String ...a) {}

	enum D { 
		X {
			void doStuff(){
				System.out.println("Xxx");
			}
		}, 
		Y {
			void doStuff(){
				System.out.println("Yyy");
			}
		};
		D(){}
		abstract void doStuff();
	}

	public int ccc() {
		return 'c';
	}
}

class K {
			K() {}
			int K() {
				return 122;
			}
}

abstract class M {
	{
		System.out.println("iu");
	}
	M(String s) {
		System.out.println(s);
	}
	abstract void doStuff();
}

class N extends M {
	static String da() {
		System.out.println("foi");
		return "veio";
	}

	N() {
		super(da());
	}

	void doStuff() {};
}

class Z {
	void oi(M m) {
		System.out.println("chamei o da superclasse");
	}

	void oi(N n) {
		System.out.println("chamei o da subclasse");
	}

	public static void main(String[] args) {
		new Z().oi((M)null);
	}
}