package sec07.ch7_1;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
		int problemLocation = car.run();
		if(problemLocation !=0) {
			System.out.println(car.tires[problemLocation-1].location+" Hanguk타이어로 교체");
			car.tires[problemLocation-1] = new Hanguk(car.tires[problemLocation-1].location,15);
		}
	}
		
//		for (int i = 1; i <= 6; i++) {
//			int problemLocation = car.run();
//			switch (problemLocation) {
//			case 1:
//				System.out.println("앞왼쪽 HangukTire로 교체");
//				car.frontLeftTire = new Hanguk("앞왼쪽", 10);
//				break;
//			case 2:
//				System.out.println("앞오른쪽 HangukTire로 교체");
//				car.frontRightTire = new Hanguk("앞오른쪽", 10);
//				break;
//			case 3:
//				System.out.println("뒤왼쪽 KumhoTire로 교체");
//				car.rearLeftTire = new Kumho("뒤왼쪽", 10);
//				break;
//			case 4:
//				System.out.println("뒤오른쪽 KumhoTire로 교체");
//				car.rearRightTire = new Kumho("뒤오른쪽", 10);
//				break;
//			}
//			System.out.println("------------------------------------------");
//		}

	}

}
