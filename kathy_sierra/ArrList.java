import java.util.ArrayList;

class A {	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Abelardo");

		// IndexOutOfBoundException
		// arr.remove(10);
		// arr.get(10);

		System.out.println(arr.remove("Juliana"));
	}
}