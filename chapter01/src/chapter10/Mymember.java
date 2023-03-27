package chapter10;

public class Mymember {

	private int id;
	private String name;

//	private으로 선언된 멤버 변수나 메서드는 해당 클래스 내부에서만 접근할 수 있습니다.
	private static Mymember instance = new Mymember();

	private Mymember() {
		this.id = 1004;
		this.name = "진짜천사";

	}

	public static Mymember getInstance() {
		if (instance == null) {
			instance = new Mymember();
		}
		return instance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
