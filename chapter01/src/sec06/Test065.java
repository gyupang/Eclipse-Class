package sec06;

public class Test065 {
	public static final int min_balance= 0;
	public static final int max_balance = 1000000;

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance <Test065.min_balance ||balance>Test065.max_balance) {
			return;
		}
		this.balance = balance;
	}

}
