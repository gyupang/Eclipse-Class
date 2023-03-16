package sec04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class exam04 {

	public static void main(String[] args) {
		LocalTime nowTime = LocalTime.now();
		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		
		int hour = nowTime.getHour();
		int minute = nowTime.getMinute();
		int second = nowTime.getSecond();
		
		String nTime = nowTime.format(formatter);
		System.out.println(nTime);
		
		
//		자바 8이후
		/*	java.time.localDate
		 * java.time.localTime
		 * java.time.LocalDateTime
		 자바8이전
			java.util.Date
			java.util.Calendal
			
			LocalDate now = LocalDate.now()
			
			*/

		switch (hour) {
		case 9:
			System.out.println("출근시간 입니다.");
			break;
		case 18:
			System.out.println("퇴근시간 입니다.");
			break;
		case 17:
			System.out.println("곧 퇴근");
			break;
		default:
			System.out.println("근무시간?");
			break;

		}

	}

}
