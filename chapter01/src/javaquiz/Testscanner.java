package javaquiz;

import java.util.Scanner;

public class Testscanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		2번문제
//		System.out.println("숫자 3개를 입력하세요");
//		int num1 = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		int num3 = scanner.nextInt();
//
//		System.out.println(num1 + " " + num2 + " " + num3);
// // double 타입으로 소숫점 계산
//		double sum = (double)(num1 + num2 + num3) / 3;
//		System.out.println("2번 문제  평균은"+sum);

//		5번 문제
//		System.out.println("정수 두개를 입력하세요");
//		2진수는 0과 1로 이루어진 문자열이라 String으로 입력받아야함
//		String binaryString1 = scanner.nextLine()   - 2진수 입력받을때
//		int num51 = scanner.nextInt();
//		int num52 = scanner.nextInt();

		/*
		 * parseInt(String s): 문자열을 정수로 변환합니다. parseInt(String s, int radix): radix 진법으로
		 * 표현된 문자열 s를 10진수로 변환합니다. toString(int i): 정수를 문자열로 변환합니다. toBinaryString(int
		 * i): 정수를 2진수로 변환합니다. toHexString(int i): 정수를 16진수로 변환합니다.
		 */

////		입력받은 정수를 2진수로 변경 String 으로 저장, integer.
//		String num512 = Integer.toString(num51, 2);
//		String num522 = Integer.toString(num52, 2);
//		System.out.println(num512 + " " + num522);
////		따로 2진수끼리 계산해줘야 2진수의 합이 계산됨 ** (num512+num522) 문자열 붙인결과
//		int numsum = Integer.parseInt(num512, 2) + Integer.parseInt(num522, 2);
//		System.out.println("5번 " + numsum);

//		6번

//		int nummul = Integer.parseInt(num512, 2) * Integer.parseInt(num522, 2);
//		System.out.println(nummul);

		// 7번
		System.out.println("10진수를 입력하시오");

		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int num = sc.nextInt();
		int i = 0;
		while (num != 0)
		{
			array[i] = num % 2;
			num = num / 2;
			i++;
		}
		for (int j = array.length - 1; j >= 0; j--)
		{
			System.out.println(array[j]);
		}
		scanner.close();
		sc.close();
	}

}
