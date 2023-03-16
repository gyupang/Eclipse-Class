package chapter03;

import java.util.*;

public class Exam07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String sc = scanner.nextLine();
		char var = sc.charAt(0);
		String txt;
		if (var >= 65 & var <= 90) {
			txt = "대문자";
		} else if (var >= 97 & var <= 122) {
			txt = "소문자";
		} else if (!(var < 48) && !(var > 57)) {
			txt = "숫자";
		} else {
			txt = "알파벳이 아님";
		}

	}

}
