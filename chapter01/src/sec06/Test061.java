package sec06;

public class Test061 {

	String id ="hong";
	String password ="12345";
	
	public boolean login(String id, String password) {
		if(this.id ==id && this.password ==password) {
			return true;
		}else {
			return false;
		}
	}

	public void logout(String id) {
		if(this.id==id) {
			System.out.println("로그아웃");
		}
	}
	
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

	}

}
