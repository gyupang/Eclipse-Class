package javaquiz_0406;

import java.util.Scanner;

public class Quiz9 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int x;
		
			int n = readPlusInt();
			System.out.print("반대로 읽으면 ");
		 while (n>0) {
			System.out.print(n%10); // n 의 마지막 자릿수
			n /=10;
		 }
		
		
		
		// 양의 정수값을 읽어서 반환
		static int readPlusInt() {
			int x;
			do {
				System.out.println("양의 정수값");
				x = scan.nextInt();
				
			} while (x <= 0);
			return x;
		}

	}

}
