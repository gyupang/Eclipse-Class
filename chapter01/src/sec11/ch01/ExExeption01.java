package sec11.ch01;

public class ExExeption01 {
	// 실행메소드에서도 예외를 떠넘기면 jvm 이 최종적으로 예외처리를 한다
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}

	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
