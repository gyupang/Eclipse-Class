package sec03;

import java.util.Scanner; //자바유틸에서 스킨낸

public class ScannerExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner를 생성해서 변수에 놓는다.
		// String inputData = scanner.nextLine(); // Scanner를 이용해 키보드를 읽는다

		System.out.printf("x 값입력 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);

		while (true) {
			System.out.printf("문자를 입력하세요 : ");
			String str = scanner.nextLine();
			if (str.equals("q")) {
				System.out.println("java를 정지합니다.");
				break;
			}
			System.out.println(str);
			System.out.println();
		}

	}

}
