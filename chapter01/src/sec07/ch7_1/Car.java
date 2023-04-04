package sec07.ch7_1;

public class Car {
//필드

	Tire[] tires = {
			new Tire("앞바퀴 왼쪽", 6), new Tire("앞바퀴 오른쪽", 4), new Tire("뒷바퀴 왼쪽", 3), new Tire("뒷바퀴 오른쪽", 5)
	};

//	Tire frontLeftTire = new Tire("앞바퀴 왼쪽", 6);
//	Tire frontRightTire = new Tire("앞바퀴 오른쪽", 4);
//	Tire rearLeftTire = new Tire("뒷바퀴 왼쪽", 3);
//	Tire rearRightTire = new Tire("뒷바퀴 오른쪽", 5);

	// 생성자

	// 메소드
	void stop() {
		System.out.println("**자동차가 멈춥니다.**");
		System.out.println("");
	}

	int run() {
		System.out.println("");
		System.out.println("**자동차가 달립니다.**");

		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return (i + 1);
			}
		}

//		if (frontLeftTire.roll() == false) {
//			stop();
//			return 1;
//		}
//		if (frontRightTire.roll() == false) {
//			stop();
//			return 2;
//		}
//		if (rearLeftTire.roll() == false) {
//			stop();
//			return 3;
//		}
//		if (rearRightTire.roll() == false) {
//			stop();
//			return 4;
//		}
		return 0;
	}

}
