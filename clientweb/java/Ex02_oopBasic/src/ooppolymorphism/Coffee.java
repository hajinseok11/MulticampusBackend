package ooppolymorphism;

public class Coffee extends Beverage {
    static int amount;
    // 물건이 구매되면 생성자가 호출 -> 객체생성이 곧 주문 한 건이라 생각
    public Coffee(){}
    public Coffee(String name) {
        super(name);
        amount++;
        calcPrice();// 주문한 음료에 대한 금액이 계산
    }
    @Override
    public void calcPrice() {
        if (getName().equals("Americano")){
            price = 1500;
        }else if (getName().equals("CafeLatte")){
            price = 2500;
        }else if (getName().equals("Cappuccino")){
            price = 3000;
        }else{
            price = 0;
        }
    }

}
