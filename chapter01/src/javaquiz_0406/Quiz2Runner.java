package javaquiz_0406;

import java.util.Scanner;

public class Quiz2Runner {

	public static void main(String[] args) {
		Quiz2 quiz = new Quiz2();

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 3개 입력하세요");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int resultMin = quiz.getnumMin(num1, num2, num3);
		int resultMid = quiz.getnumMid(num1, num2, num3);

		System.out.println("최소 값은 " + resultMin);
		System.out.println("중간 값은 " + resultMid);

		scan.close();
	}


}
