package sec03;

public class ScopeExam {

	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
// int v3 = v1 + v2 +5; scope 안에 있는 변수는 scope 안에서만 사용
//		%[argument_index] [flags] [width] [.percision] conversion
//		argument_index$ 일련번호
//		flags -,0
//		width 전체 자리수
//		.percision 소수점 자리수
//		conversion 변환문자 String =>s		Number =>d

		System.out.printf("이름 : %s", "홍길동");

		int val = 123;
		System.out.printf("상품의 가격: %d원\n", val);
		System.out.printf("상품의 가격: %6d원\n", val);
		System.out.printf("상품의 가격: %-6d원\n", val);
		System.out.printf("상품의 가격: %06d원\n", val);

		double area = 3.14 * r * r;
		System.out.printf("반지름이 %d인 원의 넓이: %.2f", r, area);

		String name = "홍길동";
		String job = "도둑놈";
		System.out.printf("%6d | %-10s| %10s.n", 1, name,d

	}

}
