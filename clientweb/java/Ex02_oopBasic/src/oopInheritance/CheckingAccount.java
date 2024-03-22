package oopInheritance;

public class CheckingAccount extends Account {
    private String cardNo;

    public String getCardNo() {
        return this.cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public CheckingAccount(){}
    public CheckingAccount(String accld, int balance, String ownerName, String cardNo) {
        super(accld,balance,ownerName);
        this.cardNo = cardNo;
    }

    // String은 참조형이므로 ==은 주소의 비교
    // 문자열을 비교하는 경우는 무조건 equals => 대소문자까지 비교
    public void pay(long amount, String cardNo){
        if (this.cardNo.equals(cardNo) & getBalance() >= amount ){
            // 구매가 가능하도록 - 지불할 수 있도록 작업
            withdraw(amount);
        }else{System.out.println("지불이 불가능합니다");}
    }
}


