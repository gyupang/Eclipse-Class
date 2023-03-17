package sec04;

import java.util.Random;
import java.util.Scanner;

public class ForExam05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rd = new Random();

		Boolean game = true;

		while (game) {
			System.out.println("가위 1 바위 2 보 3  끝내기 4를 입력하세요");
			int user = scanner.nextInt(); // 내꺼
			int com = rd.nextInt(3) + 1; // 컴퓨터
			System.out.println(com);
			if (user == com) {
				System.out.println("비김");
			} else if (user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2) {
				System.out.println("이김");
			} else if (user == 4) {
				System.out.println("종료");
				game = false;
			} else {
				System.out.println("짐");
			}

		}
		scanner.close();
	}
}
