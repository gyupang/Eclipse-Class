package sec04;

import java.util.*;

public class ForExam06 {

	public static void main(String[] args) {

		System.out.println("메시지를 입력하세요");
		System.out.println("종료는 q를 누르세요");

		Scanner scan = new Scanner(System.in);
		String inputString;

		do {
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q")); // .equals() 씀 String 타입과 같은 객체자료는
		System.out.println("------종료---------");
		
		scan.close();
	}

}
