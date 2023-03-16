package chapter03;

public class Exam04 {

	public static void main(String[] args) {
		int apple = 1;
		double piceApple = -0.1;
		int number = 7;

		double result = apple + piceApple * number;
		System.out.println(result);
//0.29999 가나옴
		
		
		int app = 1;
		int totalpiece = app * 10;
		int num = 7;
		int temp = totalpiece - num;
		
		double res = temp/10.0;
		System.out.println(res);
		//0.3이 나옴

	}

}
