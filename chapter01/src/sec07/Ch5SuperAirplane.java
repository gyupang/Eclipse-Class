package sec07;

public class Ch5SuperAirplane extends Ch5Airplane {
//상수 static final 정적 파이널로 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	// 부모 메소드 fly()를 오버라이드해서 바꿈
	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
		System.out.println("초음속 비행합니다");
	} else {
		// 오버라이드 하기전의 부모 fly() 실행
		super.fly();
		}
	}

}
