import java.util.Date;

class A {

	@Override
	public void finalize() {
		System.out.println("Oi");
	}
}

public class CheckGC {
	public static void main(String[] args) throws InterruptedException {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: " + rt.totalMemory());

		System.out.println("Before memory = " + rt.freeMemory());

		Date d = null;
		for(int i = 0; i < 10000; i++) {
			d = new Date();
			d = null;
		}

		System.out.println("After memory = " + rt.freeMemory());

		rt.gc();

		Thread.sleep(1000);

		System.out.println("After GC memory = " + rt.freeMemory());

		A a = null;

		for(int i = 0; i < 100; i++) {
			a = new A();
			a = null;
		}

		rt.gc();

		Thread.sleep(1000);
	}
}