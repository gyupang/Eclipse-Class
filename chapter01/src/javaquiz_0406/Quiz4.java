package javaquiz_0406;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("1부터 X까지의 합을 구합니다. ");
		int x;
		do {
			System.out.println("X을 입력하세요");
			x = scan.nextInt();
		} while (x <= 0);
		System.out.println("1부터 " + x + "까지의 합은 " + sum(x));

		scan.close();
	}

	static int sum(int n) {
		int sum = 0; // 합계
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
