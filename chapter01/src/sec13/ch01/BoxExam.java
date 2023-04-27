package sec13.ch01;

public class BoxExam {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
//		Box<String> box1 = new Box<>();

		box1.content = "안녕하세요"; // 자동 타입변환 필요없음
		String str = box1.content; // 강제 타입변환 필요없음

		System.out.println(str);

		Box<Integer> box2 = new Box<Integer>();
		box2.content = 1546;
		int val = box2.content;

		System.out.println(val);

	}

}
