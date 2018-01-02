package br.abevieiramota.ocjp7;

class Cliente {
	String nome;
	
	// ASSINATURA É IMPORTANTE
	// PUBLIC
	// BOOLEAN
	// >>>>>>>>> RECEBE OBJECT!!!!!!!!!!!!!!!!!!!!!!!
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Cliente)) {
			return false;
		}
		
		Cliente c = (Cliente) obj;
		
		return this.nome.equals(c.nome);
	}
	
	public boolean equals(Cliente c) {
		
		return false;
	}
}

class A1 {}
class B1 {
	{
		B1 b = new B1();
		/*
		 * the instanceof operator is used for object reference variables only!
		 * só pode comparar um objeto com uma classe que pertença à sua hierarquia
		 * A1 deve ser da mesma classe que b ou subclasse dela
		 */
//		if(b instanceof A1) {
//			
//		}
		
	}
}

public class Aula18 {
	
	class Pai {}
	class Filho extends Pai {}

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.nome = "Abelardo";
		Cliente c2 = new Cliente();
		c2.nome = "Adroleba";
		Cliente c3 = new Cliente();
		c3.nome = "Adroleba";
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		System.out.println(c2.equals((Object) c3));
		/*
		 * null instanceof X = false
		 */
		if(null instanceof B1) {
			System.out.println("null instanceof B1");
		}
		/*
		 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		 */
		if(((B1)null) instanceof B1) {
			System.out.println("B1 null instanceof B1");
		}
		
		/*
		 * !! array de subclasse é instanceof de array de superclasse
		 */
		if(new Filho[10] instanceof Pai[]) {
			System.out.println("Array de filho instanceof array de Pai");
		}
	}
}
