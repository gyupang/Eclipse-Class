package sec05;

public class Exam07 {

	public static void main(String[] args) {
		String ssn = "010101-3012443";
		String nssn = ssn.replace("-", "");
		int length = nssn.length();

		if (length == 13) {
			System.out.println("맞는 주민번호");
		} else {
			System.out.println("다른 주민번호");
		}
//substring(시작,끝)
// 주민번호를 앞과 뒤로 나누어 출력
		String first = ssn.substring(0, 6);
		System.out.println(first);
		String last = ssn.substring(7);
		System.out.println(last);

//		indexOf() 찾는문자열이 있으면 인덱스 번호, 없으면 -1
		String str = "떠들지 마라 좀";
		int index = str.indexOf("좀");
		System.out.println(index);
		if (index == -1) {
			System.out.println("찾는문자 없음");
		} else {
			System.out.println("찾는문자 있음");
		}
//	contains() 찾는 문자열 true false로 리턴함
		String subject = "자바 프로그램";
//		indexOf 이용 '프로그램' 찾아 문자열에서 프로그램 앞글자 출력
		int indsub = subject.indexOf("프로그램"); // 3
		String rst = subject.substring(0, indsub);
		System.out.println(rst);

//		indexOf 이용 '자바'를 찾아 있으면 '자바와 관련된 책' 없으면 '자바와 관련없는 책' 출력
		if (subject.indexOf("자바") == -1) {
			System.out.println("자바와 관련없는 책");
		} else {
			System.out.println("자바와 관련된 책");
		}

//		contains를 이용 2번과 같게 출력
		if (subject.contains("자아바")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		/*
		 * split()을 이용하여 문자열 "1,자바,학습,참조 타입 String 을 공부합니다. ,홍길동" 을 추출하여 번호 : 1 제목 : 자바
		 * 내용 : 참조타입..식으로 출력 이름 : 홍길동
		 */
		String sent = "1,자바,학습,참조 타입 String 을 공부합니다. ,홍길동";
		String[] name = { "번호", "제목", "종류", "내용", "이름" };
		String[] sentarr = sent.split(",");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + " : " + sentarr[i]);
		}

	}

}
