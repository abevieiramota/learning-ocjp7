class A { int x = 10, y = 20;}
class B extends A { int x = 20;}

class SuperInstanceVariable {
	public static void main(String[] args) {
		System.out.println(new B().x);
		System.out.println(((A) new B()).x);
	}
}