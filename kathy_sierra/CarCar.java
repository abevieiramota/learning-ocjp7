class Car {
	protected void goFast() {}
}

class BMW extends Car {
	public void goSuperFast() {
		Car c = new Car();
		c.goFast();
	}
}

public class CarCar {
	public static void main(String[] args) {
		BMW b = new BMW();
		b.goSuperFast();
	}
}