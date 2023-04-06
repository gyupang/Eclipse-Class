package javaquiz_0406;

public class Quiz6 {

void printSeason(int num) {
	switch (num) {
	case 12:
	case 1:
	case 2:
	{
		System.out.println("겨울");
	}
		
		break;
	case 3:
	case 4:
	case 5:
	{
		System.out.println("봄");
	}
	break;
case 6:
case 7:
case 8:
	{
		System.out.println("여름");
	}
	break;
case 9:
case 10:
case 11:
{
	System.out.println("겨울");
}break;

default: {
	System.out.println("잘못된 입력입니다.");
	// do while 문에서 조건 걸어놓음
}

	break;
	}
}

}
