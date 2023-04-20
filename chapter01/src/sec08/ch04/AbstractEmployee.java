package sec08.ch04;

public abstract class AbstractEmployee {
//필드
	private String name;

	public AbstractEmployee() {
	}

	public AbstractEmployee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 추상메소드
	public abstract void doWork();

}
