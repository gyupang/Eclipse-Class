package sec04;

import java.util.Scanner; // 자바유틸스캐너

public class exam01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너?
		System.out.println("점수를 입력하세요");
		int score = scanner.nextInt(); // nextInt() 사용자가 입력한 값을 읽어들이고 정수형으로 변환해주는 역할

		if (score < 60) {
			System.out.println("F 입니다.");
		} else if (score < 70) {
			System.out.println("D 입니다.");
		} else if (score < 80) {
			System.out.println("C 입니다.");
		} else if (score < 90) {
			System.out.println("B 입니다.");
		} else {
			if (score >= 95) {
				System.out.println("A+ 입니다.");
			} else {
				System.out.println("A 입니다.");
			}
		}
		scanner.close();
	}

}
