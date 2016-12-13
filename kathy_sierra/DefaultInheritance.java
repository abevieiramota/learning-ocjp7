class A { void doStuff(){System.out.println("oi");}}
class B extends A {}

class DefaultInheritance {
	public static void main(String[] args) {
		new B().doStuff();
	}
}