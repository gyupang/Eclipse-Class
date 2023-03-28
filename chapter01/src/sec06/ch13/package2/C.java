package sec06.ch13.package2;

import sec06.ch13.package1.A;

public class C {
	A a1 = new A(true);
//	A a2 = new A();
//	A a3 = new A("문자");
	/*
	 * A() 생성자는 디폴트 접근 제한자(default access modifier)를 가지고 있기 때문에
	 * 같은 패키지 내에서만 접근할 수있습니다. 
	 * private A(String s) 생성자는 private으로 선언되어 클래스 내부에서만 호출 가능합니다.
	 */

}
