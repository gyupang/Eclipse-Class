package javaquiz;

public class Test0323ans {

	static double radius = 7.5; // 여기에 넣으면 뭐임? 공부하기

	public static void main(String[] args) {
//1번문제
		System.out.println("1번 문제");
		System.out.println("넓이는 " + Math.PI * radius * radius);
		System.out.println("둘레는 " + 2 * Math.PI * radius);
//3번문제
		double width = 5.5;
		double height = 8.5;
		System.out.println("3번 문제");
		System.out.println("넓이는 " + width * height);
		System.out.println("둘레는 " + (width + height) * 2);

		// 4번 문제
		// 임시 저장해놓을 변수 하나 더 생성
		int a, b, temp;
		a = 10;
		b = 30;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a + " , " + b);

	}

}
