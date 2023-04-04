package sec07;

public class Ch5DriveAir {

	public static void main(String[] args) {
		Ch5SuperAirplane ss = new Ch5SuperAirplane();
		ss.takeOff();
		ss.fly();
		ss.flyMode = Ch5SuperAirplane.SUPERSONIC;
		ss.fly();
		ss.flyMode = Ch5SuperAirplane.NORMAL;
		ss.fly();
		ss.land();

	}

}
