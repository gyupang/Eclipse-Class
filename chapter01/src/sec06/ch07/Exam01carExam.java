package sec06.ch07;

import sec06.ch04.Car;

public class Exam01carExam {

	public static void main(String[] args) {

		Exam01car car1 = new Exam01car();
	    System.out.println(car1.company);
	    
	    // 두번째 생성자로 생성한 후 회사명 모델명 출력
	    Exam01car car2 = new Exam01car("그랜저");
	    System.out.println(car2.company);
	    System.out.println(car2.model);
	    
	    // 세번째 생성자로 생성한 후 회사명 모델명 색깔 출력
	    Exam01car car3 = new Exam01car("아반떼", "black");
	    System.out.println(car3.company);
	    System.out.println(car3.model);
	    System.out.println(car3.color);
	    
	    // 네번째 생성자로 생성한 후 회사명 모델명 색깔 최고속도 출력
	    Exam01car car4 = new Exam01car("산타페", "silver", 300);
	    System.out.println(car4.company);
	    System.out.println(car4.model);
	    System.out.println(car4.color);
	    System.out.println(car4.maxSpeed);
		
		
		
		
	}

}
