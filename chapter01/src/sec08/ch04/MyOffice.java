package sec08.ch04;

public class MyOffice {

	public static void main(String[] args) {
		Employee im = new Employee("임꺽정", "대리");
		// 세터로 받기
		im.setName("홍길동");
		im.setJobTitle("대리");
		System.out.println(im.toString());

		Employee man = new Manager("홍길동", "과장", "인사");
		System.out.println(man.toString());
		
		Drivable dd = new Driver("슈마허", "사원", "123조 456");
		dd.drive();

		Drivable ddd = new Transporter();
		ddd.drive();

	}

}
