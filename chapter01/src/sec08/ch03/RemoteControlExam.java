package sec08.ch03;

public class RemoteControlExam {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(50);
		rc.turnOff();

		rc = new Radio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		// 디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
//라디오볼륨이 나옴 ??

		RemoteControl.changeBettery();
	}

}
