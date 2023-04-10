package sec08.ch02;

public interface RemoteControl {
	// 상수 static final
	static int MAX_VOLUMN = 10;
	static int MIN_VOLUMN = 0;

	// public 추상 메소드
	public void turnOn();
	
	//default 추상 메소드 - 실행영역 없이 메소드의 선언부만 작성

	void turnOff();

	void setVolumn();
}
