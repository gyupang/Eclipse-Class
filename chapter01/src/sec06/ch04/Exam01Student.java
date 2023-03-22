package sec06.ch04;

public class Exam01Student {

	public static void main(String[] args) {
//		실행 클래스
		Exam02StudentExam hong = new Exam02StudentExam();
		Exam02StudentExam kim = new Exam02StudentExam();
		Exam02StudentExam lee = new Exam02StudentExam();

		hong.name = "홍길동";
		hong.mobile = "010-1234-1234";

		kim.name = "김철수";
		kim.mobile = "010-2345-2345";

		lee.name = "이승만";
		lee.mobile = "010-3456-3456";
		hong.absent();
		hong.absent();

		kim.comeLate();

		lee.leaveEearly();

		System.out.println(hong.name + "은 결석을 " + hong.absentSum + "번");
		System.out.println(kim.name + "은 지각을 " + kim.comeLateSum + "번");
		System.out.println(lee.name + "은 조퇴을 " + lee.leaveEearlySum + "번");

	}

}
