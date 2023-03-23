package sec06.ch07;

public class Exam01car {
//필드선언

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

//	생성자선언(오버로딩)
	Exam01car() {
	}

	Exam01car(String model) {
		this.model = model;
	}

	Exam01car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Exam01car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	
	
}
