package sec04;

public class ForExam04 {

	public static void main(String[] args) throws Exception {

		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("-----------------");
				System.out.println("1가속 2감속 3중지");
				System.out.println("-----------------");
				System.out.println("선택 : ");
			}

			keyCode = System.in.read(); // 키보드값 읽어옴
			if (keyCode == 49) { // 1
				speed++;
				System.out.println("현재속도" + speed);
			} else if (keyCode == 50) { // 2
				speed--;
				System.out.println("현재속도" + speed);
			} else if (keyCode == 51) { // 3
				run = false;
			}
		}

	}

}
