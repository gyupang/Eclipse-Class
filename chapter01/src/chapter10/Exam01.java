package chapter10;

public class Exam01 {
//필드

	static double pi = 3.14159;
	String color;
	int size;
	
	static String calInfo;
	static {
		calInfo="black";
//		color="빨강";  static 타입아닌건 불가능

		
	}
	

//	메소드

	int plus(int x, int y) {
		return x + y;
	}

	int minus(int x, int y) {
		return x - y;
	}

}
