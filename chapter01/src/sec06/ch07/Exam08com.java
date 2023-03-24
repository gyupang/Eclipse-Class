package sec06.ch07;

public class Exam08com {
	//매개변수를 모두 더하는 메소드
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	
	int sum2(int ... values) {
		int sum2 =0;
		for (int i = 0; i < values.length; i++) {
			sum2 += values[i];
		}
		return sum2;
	}
	
	
}
