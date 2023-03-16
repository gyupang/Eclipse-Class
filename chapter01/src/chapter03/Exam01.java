package chapter03;

public class Exam01 {

	public static void main(String[] args) {
		int x = -100;
		int rs = +x;
		int rs2 = -x;
		System.out.println(rs2);

		short s = 100;
		int rs3 = -s;
		// short rs4= -s; // 컴파일 에러 -s가 int로 바뀌어서 short로 변환오류

		int z = x++ + s;
		int q = ++x + s;
		System.out.println(z);
		System.out.println(q);

		int a = 1;
		int b = 1;
		int result = ++a + 10;
		int result2 = b++ + 10; // b++ 후위 연산자 . 변수를 먼저 사용후 ++증가 시킨다
		System.out.println(result);
		System.out.println(result2);
		System.out.println(b);
		
	}

}
