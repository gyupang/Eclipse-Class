package sec06;

import java.util.Calendar;

public class Myweek {

	public static void main(String[] args) {

		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.sunday;
			break;
		case 2:
			today = Week.monday;
			break;
		case 3:
			today = Week.tuesday;
			break;
		case 4:
			today = Week.wednesday;
			break;
		case 5:
			today = Week.thursday;
			break;
		case 6:
			today = Week.friday;
			break;
		case 7:
			today = Week.saturday;
			break;

		}
		System.out.println(today);
		if (today == Week.friday) {
			System.out.println("불금");
		}else if(today == Week.wednesday) {
			System.out.println("일주일의 반이 지남");
		}

	}

}
