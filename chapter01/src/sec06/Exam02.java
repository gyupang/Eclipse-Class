package sec06;

public class Exam02 {

	public static void main(String[] args) {
		int[] scores = { 88, 95, 70, 80, 99, 100 };
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
//		for-each 문으로 단축
//		for(int score:scores) {
//			sum +=score;
//		}
		System.out.println(sum);
		
		double avg = (double) sum / 6;
		System.out.println(avg);
		

	}

}
