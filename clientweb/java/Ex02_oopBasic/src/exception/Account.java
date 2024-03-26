package exception;

public class Account {
	private String accId;
	private long balance;
	private String ownerName;
	
	public Account() {
		
	}

	public Account(String accId, long balance, String ownerName) {
		super();
		this.accId = accId;
		this.balance = balance;
		this.ownerName = ownerName;
	}
	//입금하기
	public void deposit(long amount){
		balance = balance + amount;
	}
	//출금하기
	public void withdraw(long amount){
		balance = balance - amount;
	}
	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
}