package sec06.ch04;

public class Exam03CarExam {

	public static void main(String[] args) {
		// 실행클래스
		Exam03Car myCar = new Exam03Car();
		
		myCar.company = "기아자동차";
		myCar.model="EV9";
		myCar.color="BLACK";
		myCar.maxSpeed=400;
				
		myCar.Speed();
		
//		필드값
		System.out.println("제작회사 : " + myCar.company);;
		System.out.println("모델명 : " + myCar.model);;
		System.out.println("색깔 : " + myCar.color);;
		System.out.println("최고속도 : " + myCar.maxSpeed);;
		System.out.println("현재속도 : " + myCar.speed);;
		
//		필드값 변경
		myCar.Speed=60;
		System.out.println("현재속도 : " + myCar.speed);;
		
	}

}
