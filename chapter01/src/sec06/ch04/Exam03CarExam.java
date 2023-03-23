package sec06.ch04;

public class Exam03CarExam {

	public static void main(String[] args) {
		// 실행클래스
		Exam03Car myCar = new Exam03Car();

		myCar.nowSpeed();
		myCar.nowSpeed();
		myCar.nowSpeed();

//		필드값
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);


//		필드값 변경
		myCar.speed = 60;
		myCar.color = "골드";
		System.out.println("n현재속도 : " + myCar.speed);
		System.out.println("n색깔 : " + myCar.color);

	}

}
