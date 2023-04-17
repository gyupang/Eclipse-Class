package sec08.ch03;

public class SmartTelevision implements Search, RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다.");

	}

//	@Override
//	public void setVolume(int volume) {
//		// TODO 자동 생성된 메소드 스텁
//	}

	@Override
	public void searchable(String url) {
		System.out.println(url + " 을 검색합니다.");

	}

}
