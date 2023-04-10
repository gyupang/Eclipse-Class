package sec08.ch02;

public class Television implements RemoteControl {
	// 필드
	private int volumn;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volumn) {
		if (volumn > RemoteControl.MAX_VOLUMN) {
	this.volumn = RemoteControl.MAX_VOLUMN;
		} else if (volumn < RemoteControl.MAX_VOLUMN) {
	this.volumn = RemoteControl.MIN_VOLUMN;
}else {
	this.volumn =volumn;
}
	System.out.println("현재 오디오 볼륨 : " + this.volumn);
	}

}
