package sec07.exercise;

public class SnowTireExam {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; // 스노우 타이어 호출
		// Tire tire = new Tire(); // 일반 타이어 호출

		snowTire.run();
		tire.run();

	}

}
