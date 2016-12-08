public class Fusca extends Carro {
	public void sayHi() {
		System.out.println("Sou um fusca!");
	}

	public static void main(String[] args) {
		Fusca f = new Fusca();

		f.sayHi();
	}
}