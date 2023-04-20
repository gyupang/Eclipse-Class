package sec09.ch04;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();

		car.run1();
		car.run2());
		
		car.run3(new Tire){
			@Overirde
			puvlic void roll() {
				System.out.println("정말 많이 굴러갑니다.");
			}
		}

	}

}
