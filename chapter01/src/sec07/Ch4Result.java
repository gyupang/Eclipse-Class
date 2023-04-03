package sec07;

public class Ch4Result {

	public static void main(String[] args) {
		int r = 12;
		Ch4Calcul cal = new Ch4Calcul();
		System.out.println("원면적 : " + cal.areaCircle(r));
		System.out.println();
		Ch4Com com = new Ch4Com();
		System.out.println("원면적 : " + com.areaCircle(r));

	}

}
