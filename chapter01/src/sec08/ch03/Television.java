package sec08.ch03;

public class Television implements RemoteControl {
//필드
	private int volume;
	private int memoryVolume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV의 볼륨 : " + this.volume);
	}

//디폴트 오버라이딩 - 반드시 public 으로 만들어야 한다.
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리 합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음을 해제 합니다.");
			setVolume(this.memoryVolume);
		}
	}

}
