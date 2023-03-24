package sec06.ch07;

public class Exam08comExam {

	public static void main(String[] args) {

		Exam08com myCom = new Exam08com();

		int[] valueA = { 1, 2, 3 };
		int rs1 = myCom.sum1(valueA);
		System.out.println("rs1 : " + rs1);

		int rs2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("rs2 : " + rs2);

		int rs3 = myCom.sum2(1, 4, 6, 7, 11);
		System.out.println("rs3 : " + rs3);

	}

}
