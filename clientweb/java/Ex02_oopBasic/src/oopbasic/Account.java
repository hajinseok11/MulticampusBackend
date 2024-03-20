package oopbasic;

public class Account {
    private String accNo;
    private int balance;

    public String getAccNo() {
        return this.accNo;
    }
    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(accNo+"계좌가 개설되었습니다.");
    }
    public int getBalance() {
        return this.balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void save(int saveMoney){
        System.out.println(accNo +"계좌에"+saveMoney+"만원이 입금되었습니다");
        balance += saveMoney;
    }
    public void deposit(int depositMoney){
        System.out.println(accNo +"계좌에"+depositMoney+"만원이 출금되었습니다.");
        balance -= depositMoney;
    }
    public Account(){}    
    public Account(String accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

}
