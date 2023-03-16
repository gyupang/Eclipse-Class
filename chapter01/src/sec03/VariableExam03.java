package sec03;

public class VariableExam03 {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);

		double doubleValue = intValue;
		System.out.println(doubleValue);

		float floatValue = 100.5F;
		doubleValue = floatValue;
		System.out.println(doubleValue);

	}

}
