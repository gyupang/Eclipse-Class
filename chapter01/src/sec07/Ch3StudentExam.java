package sec07;

public class Ch3StudentExam {

	public static void main(String[] args) {

		Ch3Student student = new Ch3Student("홍길동", "1234567-123456", 14);
		System.out.println("이름 : " + student.name);
		System.out.println("주민번호 : " + student.ssn);
		System.out.println("학생번호 : " + student.StudentNo);

	}

}
