package sec13.ch01;

public class HomeRent implements Rentable<Home> {
	// 인터페이스의 타입파라미터를 Home 으로 설정
@Override
public Home rent() {
	return new Home();
}
}
