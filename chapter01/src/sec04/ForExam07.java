package sec04;

public class ForExam07 {

	public static void main(String[] args) {

		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
		}
//컨티뉴 문을 이용하여 1부터 100까지 수중 짝수만 출력하시오
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);

		}

	}

}
