package sec09.ch04;

public class Car {

	// 필드에 타이어 객체 대입
	private Tire tire1 = new Tire();

	// 필드에 익명 자식 개체 대입

	private Tire tire2 = new Tire();

	@Override
	public void roll() {
		System.out.println("익명 자식객체의 타이어 2가 굴러 갑니다.");
	}

}
