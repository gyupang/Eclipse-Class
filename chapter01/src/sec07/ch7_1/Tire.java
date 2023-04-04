package sec07.ch7_1;

public class Tire {
//필드
	// 최대 회전수(최대 수명)
	public int maxRotation;
	// 누적 회전수
	public int accumulateRotation;
	// 타이어의 위치
	public String location;

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메소드
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "타이어 수명 " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "타이어가 펑크났습니다. ***");
			return false;
		}
	}

}
