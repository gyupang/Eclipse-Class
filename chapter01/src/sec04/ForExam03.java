package sec04;

public class ForExam03 {

	public static void main(String[] args) {
		String[] numbers = { "one", "two", "three" };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (String num : numbers) { // foreach문 numbers를 하나씩 넘겨준다.
			System.out.println(num);
		}

		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
