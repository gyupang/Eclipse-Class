package sec05;

public class Exam06 {

	public static void main(String[] args) {
//charAt(번호)
//		철수의 주민번호는 010101-4012443

		String ssn = "010101-3012443";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("철수는 남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("철수는 여자입니다");
			break;
		}
		for (int i = 0; i < ssn.length(); i++) {
			System.out.print(ssn.charAt(i));

		}
		System.out.println();

		String ostr = "자바 프로그래머";
		String nstr = ostr.replace("자바", "JAVA");
		System.out.println(nstr);
		

	}

}
