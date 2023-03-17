package sec04;

public class ForExam {

	public static void main(String[] args) {
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x); // 실수값은 이진수에서 무한소수로 표현 오차가발생
		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
