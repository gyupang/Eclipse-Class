package javaquiz_0406;

import java.util.Random;
import java.util.Scanner;

public class Quiz10 {

	static Scanner scan = new Scanner(System.in);

//	계속 여부 확인 메소드
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.println("다시 하시겠습니까? Y=>1  n=>0");
			cont = scan.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1;
	}

	public static void main(String[] args) {

		Random rand = new Random();
		System.out.println("암산 훈련!");
		do {
			int x = rand.nextInt(100); // 0부터 99까지의 임의
			int y = rand.nextInt(100);
			int z = rand.nextInt(100);
			int pattern = rand.nextInt(4); // 패턴번호

			int answer; // 정답
			switch (pattern) {
			case 0:
				answer = x + y + z;
				break;
			case 1:
				answer = x + y - z;
				break;
			case 2:
				answer = x - y + z;
				break;

			default:
				answer = x - y - z;
				break;
			}

			while (true) {
				System.out.println(
						x + ((pattern < 2) ? " + " : " - ") + y + ((pattern % 2 == 0) ? " + " : " - ") + z + " = ");

				int k = scan.nextInt(); // 입력한 답을 받음
				if (k == answer) {
					System.out.println("정답입니다.");
					break;
				} else {
					System.out.println("틀렸습니다.");
				}

			}

		} while (confirmRetry());

	}

}