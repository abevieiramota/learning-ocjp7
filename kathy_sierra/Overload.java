class A { void doSomething(A a) { System.out.println("a");}}
class B extends A { void doSomething(B b) { System.out.println("b");}}

public class Overload {
	public static void main(String[] args) {
		B b = new B();
		A a = new A();

		b.doSomething(a);
		b.doSomething(b);
	}
}