package ooppoly_interface;

import ooppolymorphism.Beverage;
import ooppolymorphism.Coffee;
import ooppolymorphism.Tea;

public class Ex02_InstanceOfTest {
    public static void main(String[] args) {
        // 객체의 타입을 확인하는 연산자
        // 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용하는 연산자
        Beverage obj = new Coffee("아메리카노");
        Beverage obj2 = new Tea("캐모마일");
        if(obj instanceof Beverage){
            System.out.println("Beverage 타입");
        }else{
            System.out.println("Beverage 타입이 아니다");
        }
        if(obj instanceof Coffee){
            System.out.println("Coffee 타입");
        }else{
            System.out.println("Coffee 타입이 아니다");
        }
        if(obj instanceof Tea){
            System.out.println("Tea 타입");
        }else{
            System.out.println("Tea 타입이 아니다");
        }
    }
}
