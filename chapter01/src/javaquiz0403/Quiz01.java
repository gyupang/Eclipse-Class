package javaquiz0403;

import java.util.Scanner;

public class Quiz01 {
	/*
	 * 1. N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하라. - 입력 : 1번째 줄에 숫자의 개수 (1<=
	 * N <= 100), 2번째 줄에 숫자 N개가 공백없이 주어진다. 예) 5 54321
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 숫자 개수 입력 받기
		System.out.println("숫자 개수 입력 ");
		int n = scanner.nextInt();

		// 숫자 입력 받기
		System.out.println("숫자 입력 ");
		String numbers = scanner.next();

		// String을 각각 char로 변환하여 배열로저장
		char[] nums = numbers.toCharArray();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			// 합계 구하기
			sum += nums[i] - '0';
		}
		/*
		 * String num 정수형 변환 : Integer.parseInt(num); Integer.valueOf(num); 실수형 변환 :
		 * Double.parseDouble(num) // Double.valueOf(num) float, long, short
		 * 
		 * int i =1235; String si = string.valueOf(i);
		 */
		// 결과 출력
		System.out.println(sum);
		scanner.close();
	}

}
