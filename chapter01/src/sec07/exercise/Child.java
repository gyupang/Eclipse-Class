package sec07.exercise;

public class Child extends Parent {
	private int studentNo;

	public Child(String name, int studentNo) {
		// super 키워드를 사용하여 Parent 클래스의 생성자를 명시적으로 호출
		// Parent 클래스의 생성자가 매개변수를 하나만 받도록 정의되어 있기 때문에 Child 클래스에서
		// super 키워드를 사용하여 호출할 때도 매개변수를 하나만 넘겨줘야 합니다.
		super(name);
		this.studentNo = studentNo;

	}

}
