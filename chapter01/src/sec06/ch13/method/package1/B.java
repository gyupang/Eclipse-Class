package sec06.ch13.method.package1;

public class B {

	public B() {

		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; private으로 선언되어 클래스 내부에서만 호출 가능
		
		a.method1();
		a.method2();
//		a.method3(); private으로 선언되어 클래스 내부에서만 호출 가능
		
		
	}

}
