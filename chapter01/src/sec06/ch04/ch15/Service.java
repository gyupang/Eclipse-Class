package sec06.ch04.ch15;


public class Service {
	//필드
	// 생성자
	// 메소드
	@PrintAnnotation
	public void method1() {
	 System.out.println("첫번째 실행내용");
 }
	@PrintAnnotation("*")
	public void method2() {
		 System.out.println("첫번째 실행내용");
	 }
	@PrintAnnotation(value="#",number=20)
	public void method3() {
		 System.out.println("첫번째 실행내용");
	 }

}
