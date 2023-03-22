package sec06.ch04;

public class Exam02StudentExam {
//	라이브러리용
	String name; // 이름
	String mobile; // 폰번호
	int absentSum; // 결석누계
	int comeLateSum; // 지각누계
	int leaveEearlySum; // 조퇴누계

	// 결석하다
	void absent() {
		absentSum += 1;
	}

//	지각하다
	void comeLate() {
		comeLateSum += 1;
	}
//조퇴하다
	void leaveEearly() {
		leaveEearlySum +=1;
	}
	
}
