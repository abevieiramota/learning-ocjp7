public class CoolVarArgs {

	void ooi(String ... ois) {}
	void oooi(String ...ois) {}
	
	void oi(String... ois) {
		System.out.println(ois);
	}

	void oi(String x) {
		System.out.println(x);
	}

	private String a, b;

	public static void main(String[] args) {
		new CoolVarArgs().oi("Ninguém");
	}
}