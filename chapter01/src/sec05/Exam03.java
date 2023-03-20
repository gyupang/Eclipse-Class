package sec05;

public class Exam03 {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 20;
		arr1[1] = 30;
		arr1[2] = 40;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
// int 타입
		double[] arr2 = new double[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.3;
		arr2[2] = 0.4;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
// double 타입
		String[] arr3 = new String[3];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	
//		string 타입 기본값 null
	
	
	}

}
