package sec09;

public class MemberServiceExam {

	public static void main(String[] args) {
		// MemberServiceExam 클래스는 MemberService 클래스를 사용하여
		// 로그인 및 로그아웃 기능을 실행하는 main 메소드

		MemberService member = new MemberService();
		// MemberService 클래스의 인스턴스를 생성

		boolean ok = member.login("ezen", "12345");
		// login 메소드를 호출하여 "ezen"과 "12345"를 인자로 전달

		if (ok) {
			System.out.println("로그인 되었습니다.");
			// 반환된 값이 true인 경우 "로그인 되었습니다." 메시지를 출력
		}
		else {
			System.out.println("ID 또는 패스워드가 올바르지 않습니다.");
			// false인 경우 "ID 또는 패스워드가 올바르지 않습니다." 메시지를 출력
		}

		member.logout("ezen");
		// logout 메소드를 호출하여 "ezen"을 인자로 전달, "로그아웃 되었습니다." 메시지를 출력

	}

}
