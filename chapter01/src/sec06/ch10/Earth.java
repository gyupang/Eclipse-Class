package sec06.ch10;

public class Earth {

	static final double Earth_raduis = 6400;
	static final double Earth_SURFACE_AREA;
	
	static {
		Earth_SURFACE_AREA = 4 * Math.PI * Earth_raduis*Earth_raduis;
		
	}
}
