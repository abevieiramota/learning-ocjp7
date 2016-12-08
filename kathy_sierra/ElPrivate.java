public class ElPrivate {
	private int oi = 12;

	public class ClasseDeDentro {

		public int getOi() {
			return ElPrivate.this.oi;
		}
	}

	public static void main(String[] args) {
		ElPrivate e = new ElPrivate();
		ClasseDeDentro c = e.new ClasseDeDentro();

		System.out.println(c.getOi());
	}
}