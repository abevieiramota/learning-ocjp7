class A {static int x = 10, y = 20;}
class B extends A {static int y = 30;}

class SuperStaticVariable {
	public static void main(String[] args) {
		System.out.println(new B().x);
		System.out.println(new B().y);
	}
}