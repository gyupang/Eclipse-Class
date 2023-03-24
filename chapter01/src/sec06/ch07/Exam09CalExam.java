package sec06.ch07;

public class Exam09CalExam {

	public static void main(String[] args) {
//	생성

		Exam09Cal myCalc = new Exam09Cal("노랑색", "초딩용");

		System.out.println(myCalc.color + " " + myCalc.type + "계산기가 있습니다.");
		myCalc.powerOn();

		byte x = 10;
		byte y = 4;

		double rs = myCalc.divide(x, y);
		System.out.println(x + "와 " + y + "를 나눕니다");
		System.out.println("계산결과는 " + rs + "입니다");
		
		myCalc.powerOff();

	}
}
