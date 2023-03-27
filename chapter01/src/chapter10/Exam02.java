package chapter10;

public class Exam02 {

	static String company = "Samsung";
	static String model = "OLED";
	static String info;
	static int oneSumten;
	static {
		info = company + "-" + model;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		oneSumten = sum;
	}

}
