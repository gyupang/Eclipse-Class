package sec06.ch07;

public class Exam09Car {
//필드
	int gas;

//	생성자

//	메소드
	void setGas(int gas) {
		this.gas = gas;

	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 아직 있어요");
		return true;
	}

//	키턴온 메소드를 만든후 그안에서 run()을 실행 .. .run()대신에 keyTurnon()실행
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("자동차가 달립니다. gas 잔량 : " + gas);
				gas --;
			}else {
				System.out.println("가스가 떨어져 멈춥니다 gas 잔량 : " + gas);
				return;
			}
		}
	}

}
