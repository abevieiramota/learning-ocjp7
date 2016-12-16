class A { 
	public static void main(String[] args) {
		int[] arr = new int[3];

		// ArrayIndexOutOfBoundException
		// System.out.println(arr[3]);

		String a = "Abelardo";

		// NullPointerException
		// a.concat(null);

		System.out.println(a.equalsIgnoreCase(null));
	}
}