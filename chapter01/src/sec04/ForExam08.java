package sec04;

public class ForExam08 {

	public static void main(String[] args) {

		// 3번
//		int sum = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i % 3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

		// 4번
//		boolean run = true;
//		while (run) {
//
//			int dice1 = (int) (Math.random() * 6) + 1;
//			int dice2 = (int) (Math.random() * 6) + 1;
//			System.out.println("주사위1는 " + dice1 + "주사위2는 " + dice2);
//			if (dice1 == 1 && dice2 == 4 || dice1 == 4 && dice2 == 1 || dice1 == 2 && dice2 == 3
//					|| dice1 == 3 && dice2 == 2) {
//				System.out.println("주사위1는 " + dice1 + "주사위2는 " + dice2);
//				run = false;
//			} else {
//				continue;
//			}
//		}

		// 5번
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (((4 * x) + (5 * y)) == 60) {
					System.out.println("x는 " + x + " y는 " + y);
				}
			}
		}
		
		//6번
		for(int s =0; s<=5; s++) {
			for(int t =0; t<=s; t++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		//7번
		

	}
}
