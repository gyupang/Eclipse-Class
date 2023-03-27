package chapter10;

public class Singleton {
	private static Singleton single = new Singleton();

	private Singleton() {
	}

//외부에선 getInstance()만 사용가능
	Singleton getInstance() {
		return single;

	}
}
