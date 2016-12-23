class A {
	public static void main(String[] args) {
		String nome = "null";
		final String nome2 = "null";

		switch(nome) {
			case "Abelardo":
				System.out.println("Olá");
				break;
			case "Juliana":
				System.out.println("Bom dia");
				break;
			case nome2:
				System.out.println("Nome");
				break;
		}

		byte a = 2;

		switch(a) {
			default:
				System.out.println("Ooooia, caiu no default hein!");
				// fall through
			case 127:
				System.out.println("Que valor grande!");
				break;
		}

		byte b = 127;

		switch(b) {
			default:
				System.out.println("Sou um default antes do case que casa!");
				// fall through
			case 127:
				System.out.println("Sou o case que casa");
				break;
		}
	}
}