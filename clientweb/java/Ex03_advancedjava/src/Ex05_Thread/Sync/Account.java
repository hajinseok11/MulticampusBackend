package Ex05_Thread.Sync;

public class Account {
    private String accld;
    private int balance;
    private String ownerName;

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAccld() {
        return this.accld;
    }

    public void setAccld(String accld) {
        this.accld = accld;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(String accld, int balance, String ownerName) { // 생성자
        this.accld = accld;
        this.balance = balance;
        this.ownerName = ownerName;
    }
    public Account(){} // 디폴트 생성자

    public void deposit(long amount){
        this.balance += amount;

    }
    public void withdraw(long amount){
        if(this.balance > amount){
            System.out.println("현재잔액=> " + (balance-=amount)+"원");
        }

    }

}
