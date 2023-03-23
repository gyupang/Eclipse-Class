package sec06.ch04;

public class Exam04newcarExam {

	public static void main(String[] args) {
// Car 객체 생성
		Exam04newcar myCar = new Exam04newcar();
		
//		Exam04newcar의 필드값을 읽어오자
		System.out.println("모델명 " +myCar.model );
		System.out.println("시동여부 " +myCar.start );
		System.out.println("현재속도 " +myCar.speed ); //0
		
//		myCar.model = "현대자동차";
		
		myCar.method();
		System.out.println("현재속도 " +myCar.speed ); //60
	}

}
