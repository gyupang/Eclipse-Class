package sec09.ch03;

public class AA {
	// AA 필드와 메소드

	String field = "AA-field";

	void method() {

		System.out.println("AA method");
	}

	class BB {
		// BB 필드와 메소드
		String field = "BB-field";

		void method() {
			System.out.println("BB method");

		}

		void print() {
			System.out.println(this.field);
			this.method();

//			A객체 필드 메소드 사용
			System.out.println(AA.this.field);
			AA.this.method();
		}
	}

	void useBB() {
		BB b = new BB();
		b.print();
	}

}
