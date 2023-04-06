package javaquiz_0406;

public class Quiz1 {

	// 메소드
	private int signOf(int num) {
		if (num < 0) {
            return -1;
        } else if (num > 0) {
            return 1;
        } else {
			return 0;
		}

	}

	public int getSignOf(int num) {
		return signOf(num);
	}

}
