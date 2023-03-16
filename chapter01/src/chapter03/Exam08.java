package chapter03;

public class Exam08 {

	public static void main(String[] args) {
		System.out.println(3 == 3.0); // 같은값이면 같다고 취급
		System.out.println('A' == 65); // char 유니코드값이 같다

		String st1 = "홍길동";
		String st2 = "홍길동";
		String st3 = new String("홍길동");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);

		System.out.println(st1 == st2); // true
		System.out.println(st2 == st3); // false
		System.out.println(st1.equals(st3)); // equals() 메소드는 String 클래스에서 문자열을 비교하는 메소드

//		논리곱 논리합연산 (& | ^ ~) 2진수 데이터로 연산
		System.out.println("45&25= " + (45 & 25));
		System.out.println(45|25); // 비트연산
		System.out.println(45 + 25); // 정수형

		//
		System.out.println(toBinaryString(45));
		System.out.println("&");
		System.out.println(toBinaryString(25));
		System.out.println();
	}

	private static String toBinaryString(int i) {
		String str = Integer.toBinaryString(i);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}

}
