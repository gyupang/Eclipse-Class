package sec04;

import java.util.Scanner;

public class ForExam09 {

	public static void main(String[] args) {
		int opt = scanner.nextint();

		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 >");
		}
		System.out.println("프로그램 종료");

		switch (opt) {
		case 1:
			balance += scanner.nextInt();
			break;
		case 2:
			balance -= scanner.nextInt();
			break;
		case 3:
			System.out.println("잔고조회");
			break;
		case 4:
			run = false;
		}

	}

}
