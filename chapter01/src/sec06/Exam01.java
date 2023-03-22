package sec06;

import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {
//파라미터 창에 날짜를 입력받아 args 값을 읽어 000년 00월 00일을 출력해보자.
//		예 java Array Test 2022 03 22 실행
//		파라미터창에서 입력하는 방법???
		System.out.print(args[0] + "년");
		System.out.print(args[1] + "월");
		System.out.print(args[2] + "일");

//		세개의 원소가 들어가는 배열  {"길동","순이","석열"}을 만든후 5개의 원소가 들어가는 배열로 복사하라.

		String[] group = { "길동", "순이", "석열" };
		String[] ngroup = new String[5];

//		for 문으로 합침
//		for (int i = 0; i < group.length; i++) {
//			ngroup[i] = group[i];
//		}
//		arraycopy 이용하여 합침
		System.arraycopy(group, 0, ngroup, 0, group.length);

		System.out.println(Arrays.toString(ngroup));

	}

}
