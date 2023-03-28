package sec06.ch10;

public class Exam01Exam {

	public static void main(String[] args) {
		Exam01 myCal = new Exam01();

		
		
		System.out.println(Exam01.pi);
//		static 설정하면 바로 가져다가 쓸수있음.

		System.out.println(myCal.plus(20, 15));
		System.out.println(myCal.minus(17, 13));

		/*
		 * 같은 클래스 안에 있다 하더라도 정적 메소드에서 인스턴스 필드를 사용하기 위해서는 클래스가 선언되어 객체가 생성되어야 한다
		 */
//		System.out.println(c.myCal);
	}

}
