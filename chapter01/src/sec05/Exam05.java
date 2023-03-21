package sec05;

public class Exam05 {

	public static void main(String[] args) {
		String[] arr;
		arr = new String[] { "철수", "영희", "순이" };

		// java 점수를 받아서 합을 구한후 평균이 90이상이면 A 나머지 탈락
		int sum1 = add(new int[] { 85, 88, 99, 75, 77 });
		System.out.println(sum1);

		double avg = (double) sum1 / 5;
		System.out.println(avg);
	}

	public static int add(int[] scores) {

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		if (avg > 89) {

		}
		return sum;

	}

}
