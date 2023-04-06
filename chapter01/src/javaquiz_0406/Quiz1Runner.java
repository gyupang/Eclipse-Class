package javaquiz_0406;

import java.util.Scanner;

public class Quiz1Runner {

	public static void main(String[] args) {
		Quiz1 quiz = new Quiz1();

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();

		int result = quiz.getSignOf(num);
		System.out.println("반환하는 값은 " + result);

		scan.close();
	}


}
