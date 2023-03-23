package sec05;

import java.util.Scanner;

public class Test051 {

	public static void main(String[] args) {
//9번

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		double avg = 0.0;
		int sum = 0;

		while (run) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("1.학생수 ㅣ 2.점수입력 ㅣ 3.점수리스트 ㅣ 4.분석 ㅣ 5.종료");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수를 입력하세요");
				int x = scanner.nextInt();
				scores = new int[x];
				System.out.println("선택>  " + 1);
				System.out.println("학생수> " + scores.length);
			} else if (selectNo == 2) {
				System.out.println("점수를 입력하세요");
				for (int i = 0; i < scores.length; i++) {
					
					scores[i] = scanner.nextInt();
				}
				System.out.println("선택>  " + 2);

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}
			} else if (selectNo == 4) {
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {
						max = scores[i];
						sum += scores[i];
					}
					;
				}
				;
				System.out.println("선택>  " + 4);
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + avg / scores.length);
			} else if (selectNo == 5) {
				System.out.println("선택>  " + 5);
				System.out.println("프로그램 종료");
				run = false;
			}
		}

//따옴표 없어도 오류X?
	}

}
