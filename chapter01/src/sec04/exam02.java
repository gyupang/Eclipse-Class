package sec04;

public class exam02 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1;
//		if (num == 1) {
//			System.out.println("1번이 나왔습니다");
//		} else if (num == 2) {
//			System.out.println("2번이 나왔습니다");
//		} else if (num == 3) {
//			System.out.println("3번이 나왔습니다");
//		} else if (num == 4) {
//			System.out.println("4번이 나왔습니다");
//		} else if (num == 5) {
//			System.out.println("5번이 나왔습니다");
//		} else {
//			System.out.println("6번이 나왔습니다");
//		}
		switch (num) {
		case 1:
			System.out.println("1번이 나왔습니다");
			break;
		case 2:
			System.out.println("2번이 나왔습니다");
			break;
		case 3:
			System.out.println("3번이 나왔습니다");
			break;
		case 4:
			System.out.println("4번이 나왔습니다");
			break;
		case 5:
			System.out.println("5번이 나왔습니다");
			break;
		case 6:
			System.out.println("6번이 나왔습니다");
			break;
		}

		// 8이상 12미만의 랜덤정수 8출근 9회의 10업무 그이외는 외근을 나갑니다.
		int num2 = (int) (Math.random() * 4) + 8; // 0-3까지 랜덤숫자 +8 = 8부터 11까지
		System.out.println(num2);

		switch (num2) {

		}

	}

}
