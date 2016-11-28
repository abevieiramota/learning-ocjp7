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

public class Aula18 {

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
	}
}
