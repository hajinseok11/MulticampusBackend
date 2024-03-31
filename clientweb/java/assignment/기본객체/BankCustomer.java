public class BankCustomer {
    private String name;
    private int currentMoney;

    public BankCustomer(){}
    public BankCustomer(String name, int currentMoney) {
        this.name = name;
        this.currentMoney = currentMoney;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCurrentMoney() {
        return this.currentMoney;
    }
    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }
    public void withdraw(int money){
        if (currentMoney > money){
            currentMoney = currentMoney - money;
        }else if(currentMoney < money){
            System.out.println("잔액이 부족하여 인출할 수 없습니다.");
        }
             
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", currentMoney='" + getCurrentMoney() + "'" +
            "}";
    }


}
