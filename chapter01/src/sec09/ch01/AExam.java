package sec09.ch01;

public class AExam {

	public static void main(String[] args) {
		// A객체 생성
		A a = new A();

		// B객체 생성
		A.B b = a.new B();

		a.useB();
		a.useB2();

	}

}
