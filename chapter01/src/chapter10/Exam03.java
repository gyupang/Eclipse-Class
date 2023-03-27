package chapter10;

public class Exam03 {

	int speed;
	void run() {
		System.out.println("자동차가 " + speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Exam03 myCar= new Exam03();
		myCar.speed = 60;
		myCar.run();
	}
	
}
