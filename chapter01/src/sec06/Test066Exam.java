package sec06;

import java.util.Scanner;

public class Test066Exam {

	private static Test066[] accountArray = new Test066[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------------");
			System.out.println("1.계좌생성 ㅣ 2.계좌목록 ㅣ 3.예금 ㅣ 4.출금 ㅣ 5.종료");
			System.out.println("----------------------------------------------------------------");
			System.err.println("선택 > ");

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				doposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	// 1.계좌생성
	private static void createAccount() {
		System.out.println("계좌생성");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("예금주 : ");
		String owner = scanner.next();
		System.out.println("최초입금액 : ");
		int balance = scanner.nextInt();

		Test066 newAccount = new Test066(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌 생성완료");
				break;
			}
		}

	}

//2.계좌목록
	private static void accountList() {
		System.out.println("계좌목록");
		for (int i = 0; i < accountArray.length; i++) {
			Test066 account = accountArray[i];
			if (account != null) {
				System.out.println(account.getAno());
				System.out.println(account.getOwner());
				System.out.println(account.getBalance());

			}
		}
	}

//3.예금
	private static void doposit() {
		System.out.println("예금");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("입금액 : ");
		int money = scanner.nextInt();

		Test066 account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌가 없습니다");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("입금이 완료");

	}

//4.출금
	private static void withdraw() {
		System.out.println("출금");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("출금액 : ");
		int money = scanner.nextInt();

		Test066 account = findAccount(ano);
		if (account == null) {
			System.out.println("계좌가 없습니다");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("출금이 완료");

	}

	private static Test066 findAccount(String ano) {
		Test066 account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if (dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
}
