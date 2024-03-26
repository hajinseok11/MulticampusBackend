package exception;

public class Ex12_TestAccount {
	public static void main(String[] args) {
		CheckingAccount acc1 = new CheckingAccount("111-222-333", 1000000, "장동건", "1234-5647-8888");
		try {
			acc1.pay(500000, "1234-5678-8888");
			System.out.println("현재잔액====>" + acc1.getBalance());
		} catch (BankException e) {
			System.out.println(e.getMessage());
		}

		try {
			acc1.pay(500000, "1234-5647-8888");
			System.out.println("현재잔액====>" + acc1.getBalance());
		} catch (BankException e) {
			System.out.println(e.getMessage());
		}
	}

}

