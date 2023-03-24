package sec06.ch07;

public class Exam09CarExam {

	public static void main(String[] args) {
		Exam09Car myCar = new Exam09Car();

		myCar.setGas(10); // gas 10 주유

		boolean isGas = myCar.isLeftGas(); // 가스가 있는지 확인
		if (isGas) {
			System.out.println("출발합니다");
			myCar.run(); // Car 의 run() 호출해서 차량을 출발시킨다.

		}
		if (!myCar.isLeftGas()) {
			System.out.println("gas를 주입해주세요");
		}

	}

}
