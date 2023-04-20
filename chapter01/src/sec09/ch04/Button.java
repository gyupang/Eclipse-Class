package sec09.ch04;

public class Button {

	public static interface ClickListener {

		// 추상 메소드
		void onClick();

	}

	// 필드
	private ClickListener clickListener;

	// 메소드
	public void setClickListner(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	// Botton 이 클릭 되었을 때 실행하는 메소드 선언
	public void click() {
		this.clickListener.onClick();
	}

}
