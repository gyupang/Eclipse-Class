package sec09;

public class MemberService {
	private String id;
	private String password;

	// MemberService 클래스는 회원 로그인 및 로그아웃을 처리하는 메소드

	public boolean login(String id, String password) {
		// login 메소드는 매개변수로 전달된 id와 password를 클래스의 멤버 변수로 저장
		this.id = id;
		this.password = password;

		// id와 password가 "ezen"과 "12345"인 경우 true를 반환 아닌경우 false를 반환
		if (id == "ezen" && password == "12345") {
			return true;
		} else {
			return false;
		}
	}

	public void logout(String id) {
		// logout 메소드는 매개변수로 전달된 id와 password를 클래스의 멤버 변수에서 삭제
		this.id = null;
		this.password = null;
		// "로그아웃 되었습니다." 메시지를 출력
		System.out.println("로그아웃 되었습니다.");
	}
}
