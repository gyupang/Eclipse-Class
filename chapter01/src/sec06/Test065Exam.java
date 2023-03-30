package sec06;

public class Test065Exam {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Test065 account = new Test065();
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance());
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance());
	}

}
