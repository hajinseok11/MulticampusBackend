package ooppolymorphism;

public class Tea extends Beverage {
    static int amount;
    public Tea(){}
    public Tea (String name){
        super(name);
        amount++; // 판매된 Tea의 갯수를 누적
        calcPrice();// 판매된 Tea에 가격셋팅
    }
    

    @Override
    public void calcPrice() {
        if (getName().equals("lemonTea")){
            price = 1500;
        }else if (getName().equals("ginsengTea")){
            price = 2000;
        }else if (getName().equals("redginsengTea")){
            price = 2500;
        }else {
            price = 0;
        }
    }
    
}
