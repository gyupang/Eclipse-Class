package sec05;

public class Test05 {

	public static void main(String[] args) {
		
//		6번 [][] 괄호 3개 공부해보기
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		System.out.println(array.length); // 3
		System.out.println(array[2].length); // 5

//		7번
		int max = 0;
		int[] array1 = { 1, 5, 3, 8, 2 };
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] > max) {
				max = array1[i];	};
		};
		System.out.println("max : " + max);
		
//		8번
		int[][] array3 = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}				
		};
		int sum =0;
		double avg = 0.0;
				int total = 0;
		for(int i = 0; i < array3.length; i++) {
			for(int j = 0; j < array3[i].length; j++) {
				sum += array3[i][j];
				total++;
			};
		};
		avg = (double)sum/total;
		
		System.out.println("total : " + total);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
	}

}
