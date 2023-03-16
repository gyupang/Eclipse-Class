package chapter03;

public class Exam09 {

	public static void main(String[] args) {
		int rs = 0;
		rs += 10;
		System.out.println(rs);
		rs -= 5;
		System.out.println(rs);
		rs *= 3;
		System.out.println(rs);
		rs /= 5;
		System.out.println(rs);
		rs %= 3;
		System.out.println(rs);

		int score = 90; // 정수형 int
		String three = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";  // 문자열로 출력 String

		System.out.println(three);
		
		
		int pencils = 534;
		int students = 30;
		int pencilsPerStudent = ( pencils/students ); //학생 한 명이 가지는 연필 수
		System.out.println(pencilsPerStudent);
		int pencilsLeft = ( pencils%students ); //남은 연필 수
		System.out.println(pencilsLeft);
		
		int value = 356;
		System.out.println( value/100*100 );
		
		
		int x = 10;
		int y = 5;
		System.out.println( ( x>7 ) && ( y<=5 ) );

		System.out.println( ( x % 3 == 2 ) || ( y%2 != 1 ) );

		
	}

}
