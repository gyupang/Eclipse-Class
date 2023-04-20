package sec08.ch04;

public class Transporter implements Drivable {
	private String carNo;

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public void drive() {
		System.out.println("배달맨이 운전합니다.");
	}

	@Override
	public void transpoter() {
		System.out.println("배달맨이 물건을 운송합니다.");
	}

}
