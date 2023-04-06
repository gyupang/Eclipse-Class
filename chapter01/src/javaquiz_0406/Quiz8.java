package javaquiz_0406;

import java.util.Scanner;
import java.util.random.*;

public class Quiz8 {
//	a<= 난수 <= b 인 난수를 생성하는 random 메서드를 작성하라. (b <= a 인 경우 그대로 a값을 반환할 것)
//			   hint :  난수 라이브러리     java.util.Random; 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("난수를 생성");
		System.out.println("하한값 : ");
		int min = scan.nextInt();
		System.out.println("난수를 생성");
		System.out.println("하한값 : ");
		int max = scan.nextInt();
		
		
//b이상 a이하 난수 생성
		
		static int random(int a, int b) {
			if(b<a) {
				return a;
			}else {
				Random rd = new Random();
			}
		}

	}

}
