package sec08.ch03;

public class SmartTVExam {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();

		// 두번째 케이스
		Search sch = new SmartTelevision();
		sch.searchable("http://youtube.com");

	}

}
