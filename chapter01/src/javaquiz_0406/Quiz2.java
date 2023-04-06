package javaquiz_0406;

public class Quiz2 {

	private int numMin(int num1, int num2, int num3) {
		int min = num1;
		if (num2 < min) {
			return num2;
		}
		if (num3 < min) {
			return num3;
		}
			return min;
	}

	public int getnumMin(int num1, int num2, int num3) {
		return numMin(num1, num2, num3);
	}

	private int numMid(int num1, int num2, int num3) {
		if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
			return num1;
		} else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
			return num2;
		} else {
			return num3;
		}
	}

	public int getnumMid(int num1, int num2, int num3) {
		return numMid(num1, num2, num3);
	}

}
