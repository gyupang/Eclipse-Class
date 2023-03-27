package javaquiz;

import java.time.Instant;

public class quiz02 {

	public static void main(String[] args) {
		long ms = Instant.now().getEpochSecond();
//		초단위로 받음
		System.out.println(ms);
		long year = ms / (365*24*60*60);
		int day = (int)(ms/60/60/24)%365;
		System.out.println(year+" 년"+day+" 일 지남");

	}

}
