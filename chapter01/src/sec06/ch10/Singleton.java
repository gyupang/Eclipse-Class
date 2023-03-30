package sec06.ch10;

public class Singleton {
	private static Singleton single = new Singleton();

	private Singleton() {
	}

//외부에선 getInstance()만 사용가능
	static Singleton getInstance() {
		return single;

	}
}
