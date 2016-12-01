package br.abevieiramota.ocjp7;

class A {}
class B extends Bereu {}

public class Aula19 {

	public static void main(String[] args) {
		
		Bereu a;
		B b = new B();
		System.out.println(a = b);
		
		boolean v = false;
		
		if(v = true) {
			System.out.println("cuidado");
		}
		
		if(v) 
			System.out.println("1");
		else if (v)
			System.out.println("2");
		else if (v)
			System.out.println("3");
		else 
			System.out.println("4");
		
		// !!!!!!!!!!!!!!
		int valor = 100;
		if (valor > 200)
			if(valor < 400)
				if(valor > 300)
					System.out.println("a");
				else
					System.out.println("b");
			else
				System.out.println("c");
		
	}
	
	public int doAlgo() {
		return 5;
//		System.out.println(); erro de compilação
	}
	
	public int doMeioAlgo(int x) {
		if(x > 100) {
			return 10;
		}
		// todos os caminhos possíveis devem ter resultado!
		return 5;
	}
}
