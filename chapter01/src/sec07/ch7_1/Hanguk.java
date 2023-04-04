package sec07.ch7_1;

public class Hanguk extends Tire {

//생성자
	public Hanguk(String location, int maxRotation) {
		super(location, maxRotation);

	}
//메소드
	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "한국 타이어 수명 " + (maxRotation - accumulateRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "한국 타이어가 펑크났습니다. ***");
			return false;
		}
	}

}
