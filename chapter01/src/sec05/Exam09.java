package sec05;

public class Exam09 {

	public static void main(String[] args) {
		int[] oldArray = { 1, 2, 3 };
		int[] newArray = new int[5];
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		for (int j = 0; j < newArray.length; j++) {
			System.out.println(newArray[j] + " ,");
		}

		String[] oldStr = { "java", "html", "css" };
		String[] newStr = new String[6];
		System.arraycopy(oldStr, 0, newStr, 0, oldStr.length);
//		자바 배열 복사하는 방법
		for (int i = 0; i < newStr.length; i++) {
			System.out.print(newStr[i] + " ");
		}

	}

}
