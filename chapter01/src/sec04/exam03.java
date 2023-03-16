package sec04;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("직책을 입력하세요");
		String grade = scanner.nextLine(); // nextLine() 입력받은 문자열을 반환하는 역할
											// nextInt() 사용자가 입력한 값을 읽어들이고 정수형으로 변환

		switch (grade) {
		case "부장":
			System.out.println("월급 600");
			break;
		case "과장":
			System.out.println("월급 400");
			break;
		default:
			System.out.println("월급 800");
			break;
		}
		scanner.close();
	}

}
