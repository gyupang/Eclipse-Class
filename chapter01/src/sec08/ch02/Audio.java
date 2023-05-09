package sec08.ch02;

public class Audio implements RemoteControl {
	// 필드
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		// TODO 자동 생성된 메소드 스텁

	}

}
