package chapter10;

public class PersonExam {

	public static void main(String[] args) {

		Person p1 = new Person("200101-1234567","이순신");
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		p1.name = "홍길동";
//		p1.ssn = "990909-2345678";  final 필드라 선언되면 변경 불가능
		System.out.println(p1.name);
		System.out.println(p1.ssn);
	}

}
