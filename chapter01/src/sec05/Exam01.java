package sec05;

public class Exam01 {

	public static void main(String[] args) {
		String strVal1 = "홍길동";
		String strVal2 = "홍길동";
//다른 객체이므로 참조하는 주소가 다르다
//		문자열이 같아서 문자열 리터럴 풀에서 참조한는 객체를 공유함
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2가 참조하는 주소는 같다");
		} else {
			System.out.println("strVal1과 strVal2가 참조하는 주소는 다르다");
		}
// new 연산자를 사용하여 객체마다 고유한 메모리 주소를 가짐
		String strVal3 = new String("홍길동");
		String strVal4 = new String("홍길동");
		if (strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4가 참조하는 주소는 같다");

		} else {
			System.out.println("strVal3과 strVal4가 참조하는 주소는 다르다");
		}

		// 문자열의 내용연산은 equals를 이용한다.
		if (strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4의 문자열은 같다");
		}

	}

}
