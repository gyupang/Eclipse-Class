package javaquiz_0406;

import java.util.Scanner;

public class Quiz7 {
//	c를 n개 표시하는 putChar 메서드와 이 메서드를 내부에서 호출해서 문자 '*'를 n개 연속으로 표시하는 putStart 메서드를 작성하라. 또, 이 메서드를 사용해서 
//	   직각삼각형을 만드는 프로그램을 작성하라.

	// 메서드
	static void putChar(char c, int n) {
		while (n-- > 0) {
			System.out.print(c);
		}
	}

	static void putStars(int n) {
		putChar('*', n);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("직각 삼각형 출력");
		System.out.println("단수를 입력하세요 >");

		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			putStars(i);
			System.out.println();
		}

	}

}
