package sec06.ch04;

public class Exam05KoreanExam {

	public static void main(String[] args) {
// Exam05Korean 객체 생성
		
		Exam05Korean k1  = new Exam05Korean("김철수", "010-1234-5678");
		
		System.out.println("국적 : " + k1.nation);
		System.out.println("이름 : " + k1.name);
		System.out.println("번호 : " + k1.mobile);
		
		Exam05Korean k2 = new Exam05Korean("이영희", "010-4321-0000");
		Exam05Korean k3 = new Exam05Korean("박민수", "010-0000-1234");

		System.out.println("국적 : " + k2.nation);
		System.out.println("이름 : " + k2.name);
		System.out.println("번호 : " + k2.mobile);

		System.out.println("국적 : " + k3.nation);
		System.out.println("이름 : " + k3.name);
		System.out.println("번호 : " + k3.mobile);

	}

}
