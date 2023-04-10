package sec08.ch02;

public class Audio implements RemoteControl {
	// 필드
	private int volumn;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

}
