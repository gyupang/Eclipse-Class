package sec05;

public class Exam02 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		System.out.println("Scores[0]: " + scores[0]);
		System.out.println("Scores[1]: " + scores[1]);
		System.out.println("Scores[2]: " + scores[2]);
//scores의 총합과 평균을 구하라.
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 :" + sum);
		double avg = (double) sum / 3;
		System.out.println("평균:  " + avg);

		int[] exams;
		exams = new int[] { 75, 88, 68 };
		int sum2 = 0;
		for (int i = 0; i < exams.length; i++) {
			sum2 += exams[i];
		}
		System.out.println("총합2 :" + sum2);

	}

}
