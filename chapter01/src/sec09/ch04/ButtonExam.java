package sec09.ch04;

public class ButtonExam {

	public static void main(String[] args) {
//Button 객체 생성

Button btn = new Button();

//Button click 이벤트 처리시 clickListener 구현 클래스
class OkListener implements Button.ClickListener {
	@Override
	public void onClick() {
		System.out.println("버튼을 클릭했습니다");

	}
}

//버튼 객체에 ClickListener 구현 객체 주입
btn.setClickListner(new OkListener());

//버튼 클릭
btn.click();

//cancel 버튼
Button btnCancel = new Button();

//Cancle click 이벤트 처리시 clickListener 구현 클래스
class CancleListener implements 

	}

}
