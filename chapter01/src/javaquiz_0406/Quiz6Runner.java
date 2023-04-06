package javaquiz_0406;

import java.util.Scanner;

public class Quiz6Runner {

	public static void main(String[] args) {
		Quiz6 quiz = new Quiz6();

		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("계절 달을 입력하세요");
			num = scan.nextInt();
		} while (num < 1 || num > 12);
		// 범위 밖으로 넘어가면 계속 입력시킴

		quiz.printSeason(num);


		scan.close();
	}

}
