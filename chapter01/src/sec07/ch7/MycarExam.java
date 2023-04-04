package sec07.ch7;

public class MycarExam {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Car c = new Car();
		HybridCar h = new HybridCar();

		v.displayInfo();
		System.out.println();
		c.displayInfo();
		System.out.println();
		h.displayInfo();
		System.out.println();
		
		Vehicle c1 = new Car();
		Vehicle c2 = new HybridCar();
		Car c3 = new HybridCar();

		c1.displayInfo();
		System.out.println();
		c2.displayInfo();
		System.out.println();
		c3.displayInfo();
		System.out.println();

		// 부모 객체라 불가능
//		HybridCar c4 = new Vehicle();
//		Car c5 = new Vehicle();

	}

}
