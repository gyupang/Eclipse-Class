package sec07;

public class Ch1PhoneExam {

	public static void main(String[] args) {
//		 Phone 객체 생성
		Ch1Phone Galaxy = new Ch1Phone("S23 울트라", "핑크", true);

//		Ch1에서 상속받은 필드
		System.out.println("모델 : " + Galaxy.model);
		System.out.println("칼라 : " + Galaxy.color);

//		Ch1에서 상속받은 메소드
		Galaxy.powerOn();
		Galaxy.bell();
		Galaxy.sendVoice("여보세요~");
		Galaxy.receiveVoice("안녕하세요 저는 홍길동입니다");
		Galaxy.sendVoice("네 끊습니다");
		Galaxy.hangUp();

//		 Phone 필드 pen 이 true 이면 Phone 호출
		if (Galaxy.pen) {
			Galaxy.turnonPen();
			Galaxy.drawPen();
			Galaxy.turnoffPen();

		}
	}

}
