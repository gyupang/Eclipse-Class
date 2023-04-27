package sec11.ch02;

public class Account {
	private long balance;

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws InsufficientException {
		if (balance < money) {
//예외처리
			throw new InsufficientException("잔고 부족 : " + (money - balance) + "원 부족");
			
	}
		balance -=money;
	}
}
