package chapter03;

import java.util.*;

public class Exam06 {

// NaN infinity는 double 타입

	public static void main(String[] args) {
		double dmoney = 1000000.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금액을 입력하세요");
		String InputData = scanner.nextLine();
		double newmoney = Double.valueOf(InputData);
		if (Double.isNaN(newmoney)) { //객체 래퍼 클래스(wrapper class)  Double 대문자로 시작
			System.out.println("NaN 입력 불가능");
			newmoney = 0;
		}
		double totalmoney = dmoney + newmoney;
		System.out.println(newmoney + "를 입금");
		System.out.println("현재 잔고" + totalmoney);

	}

}
