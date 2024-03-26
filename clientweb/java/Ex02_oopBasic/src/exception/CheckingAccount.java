package exception;


public class CheckingAccount extends Account {
	private String cardNo;
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public CheckingAccount() {
		
	}
	public CheckingAccount(String accId, long balance, String ownerName, String cardNo) {
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}
	public void pay (long amount,String cardNo) throws BankException {
		if(cardNo == this.cardNo){
			if(super.getBalance()>=amount) {
				super.withdraw(amount);
			}else {
				throw new BankException("지불이 불가능합니다"); //잔액부족
			}
		}else {
			throw new BankException("지불이 불가능합니다"); //계좌정보 불일치
		}
	}
	
}


