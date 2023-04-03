package sec07;

public class Ch1Phone extends Ch1 {
//필드
	Boolean pen;

	// 생성자
	Ch1Phone(String model, String color, Boolean pen) {
		this.model = model;
		this.color = color;
		this.pen = pen;
	}

		// 메소드
		void turnonPen() {
			System.out.println("갤럭시 "+ model+"의 펜을 꺼냅니다");
		}

		void drawPen() {
			System.out.println("갤럭시 "+ model+"에 그림을 그립니다.");
		}
		void turnoffPen() {
			System.out.println("갤럭시 "+ model+"에 펜을 넣습니다.");
		}
		
	}

