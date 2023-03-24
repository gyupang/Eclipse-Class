package sec06.ch07;

public class CalculatorExam {

	public static void main(String[] args) {
		
		double rs3 = 10 * 10 * Calculator.pi;

		Calculator myCal = new Calculator();

//		정사각형 넓이

		double rs1 = myCal.areaRect(15);

//직사각형 넓이
		double rs2 = myCal.areaRect(18, 22);
		System.out.println("정사각형 넓이 : " + rs1);
		System.out.println("직사각형 넓이 : " + rs2);

	}

}
