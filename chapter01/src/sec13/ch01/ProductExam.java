package sec13.ch01;

public class ProductExam {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();

		// Setter 매개값은 반드시 Tv와 String을 제공
		product1.setKind(new Tv());
		product1.setModel("LG나노 tv");

		// Getter 리턴값은 일치
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		// K는 Car로 대체, M은 String으로 대체
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("테슬라 S");

		Car car = product2.getKind();
		String carModel = product2.getModel();

	}

}
