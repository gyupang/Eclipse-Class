package javaquiz;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
////		1번
//		System.out.println("화씨를 입력하세요");
//		double faren = scanner.nextDouble();
//		double cel = (5 * (faren - 32)) / 9;
//		System.out.println("섭씨는 " + cel);
//		System.out.println("화씨는 " + faren);

////		2번
//		System.out.println("인치를 입력하세요");
//		double inch = scanner.nextDouble();
//		double meter = (double) (inch / 39.37);
//		System.out.println("미터는 " + meter);
//		System.out.println("인치는 " + inch);

		// 3번
//		System.out.println("정수를 입력하세요");

//		String num = scanner.nextLine();
////		if(num) 빈자리 출력 에러남
//		String[] numArray = new String[3];
//		String[] split = num.split("");
//		int num1 = Integer.parseInt(split[0]);
//		int num2 = Integer.parseInt(split[1]);
//		int num3 = Integer.parseInt(split[2]);
//		System.out.println(num1+num2+num3);

//		3-1번
//		456
//		10으로 나눈 나머지
		System.out.println("0-1000까지 정수를 입력하세요");
		int num = scanner.nextInt();

		int f = num % 10;
		int nf = num / 10;
		int s = nf % 10;
		nf = nf / 10;
		int th = nf % 10;
		nf = nf / 10;
		int fo = nf % 10;
		int sum = th + s + f + fo;
		System.out.println(sum);

		scanner.close();
	}
}
