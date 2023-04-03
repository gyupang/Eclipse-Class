package javaquiz0403;

import java.util.Scanner;

public class Quiz02 {
	/*
	 * 철수가 이번 시험을 망쳤다. 그래서 점수를 조작해 집에 가져가려고 한다. 일단 철수는 자기 점수중 최대값을 골랐다. 그런 다음 최댓값을
	 * M이라 할 때 모든 점수를 점수/M*100 으로 고쳤다. 예를 들어 철수의 최고 점이 70점, 수학 점수가 50점이라면 고친 수학 점수는
	 * 50/70*100 이므로 73.43점이 된다. 철수의 방법으로 성적을 계산했을 때 새로운 평균을 구하는 프로그램을 작성하라.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("입력할 시험갯수");
		int count = scan.nextInt();
		double[] numArray = new double[count];
		double[] newArray = new double[count];
		double numMax = 0;
		double numsum = 0;
		double newsum = 0;

		for (int i = 0; i < count; i++) {
			System.out.println("점수를 입력하세요");
			numArray[i] = scan.nextInt();
			if (numArray[i] >= numMax) {
				numMax = numArray[i];
			}
			newArray[i] = numArray[i] * 100 / numMax;
			numsum += numArray[i];
			newsum += newArray[i];
		}
//newArray[i] 가 계속 100이나옴 공부해보기
		System.out.println(numArray[0] / numMax);
		System.out.println(newArray[0]);
		System.out.println("원래 평균 : " + numsum / count);
		System.out.println("수정 평균 : " + numsum * 100 / numMax / count);
		System.out.println("수정2 평균 : " + newsum / count);

		scan.close();
	}

}
