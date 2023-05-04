package sec15.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {


	public static void main(String[] args) {

		// ArrayList 객체 생성
		List<String> list1 = new ArrayList<>();
		// Linked 객체 생성
		List<String> list2 = new LinkedList<>();
		
		// 시작시간 끝시간 저장할 변수
		long startTime;
		long endTime;

		// ArrayList 저장시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%-17s %,d ns \n", "ArrayList 걸린 시간 : ", (endTime - startTime));

	// LinkedList 저장시간 측정
	startTime=System.nanoTime();for(

	int i = 0;i<1000;i++)
	{
		list2.add(0, String.valueOf(i));
	}
	endTime = System.nanoTime();
	System.out.printf("%-17s %,d ns \n", "LinkedList 걸린 시간 : ", (endTime - startTime));
}

}
