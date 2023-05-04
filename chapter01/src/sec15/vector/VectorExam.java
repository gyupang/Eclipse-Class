package sec15.vector;

import java.util.ArrayList;
import java.util.List;

import sec15.Board;

public class VectorExam {

	public static void main(String[] args) {

		// List<Board> list = new Vector<>();
		List<Board> list = new ArrayList<>();


// 작업 스레드를 위한 객체 1 생성
Thread threadA = new Thread() {
	
	@Override
	public void run() {
		//객체 1000개 추가
		for(int i=1; i<=1000; i++) {
			list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
		}
	}
};

//작업 스레드를 위한 객체 2 생성
Thread threadB = new Thread() {

	@Override
	public void run() {
		// 객체 1000개 추가
		for (int i = 1; i <= 1000; i++) {
			list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
		}
	}
};

//작업스레드 실행
threadA.start();
threadB.start();

// 스레드들이 종료될 때까지 메인 스레드를 기다리게함
try {
	threadA.join();
	threadB.join();
} catch (Exception e) {
	e.printStackTrace();
}
}
}