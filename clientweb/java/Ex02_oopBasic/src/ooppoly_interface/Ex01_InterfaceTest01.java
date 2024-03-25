package ooppoly_interface;
/**
 * 인터페이스 특징
 * => 추상메서드만 정의하는 특별한 클래스
 * => 인터페이스를 정의하고 사용하면서 다형성을 적용할 수 있고 다중상속을 구현할 수 있다.
 * => 상위타입으로 사용될 특별한 클래스
 * 
 * 1. 인터페이스는 interface라는 키워드를 이용해서 정의
 * 2. 인터페이스는 추상메서드만 정의하는 특별한 클래스이므로
 *      - 인터페이스에 정의하는 메서드는 public과 abstract 생략이 가능
 *      - 하위클래스에서 오버라이딩 될 때 자동으로 public이 추가되면서 구현된다.
 *      - 리턴타입이나 매개변수는 일반 메서드와 동일하게 정의
 * 3. 인터페이스가 인터페이스를 상속하는 경우 extends키워드를 이용해서 상속한다.
 *      - 인터페이스 끼리 상속하는 경우 다중상속이 가능
 *      - , 로 구분해서 사용
 * 4. 클래스가 인터페이스를 상속하는 경우 다중상속이 가능
 *      - 클래스가 인터페이스를 상속하는 경우는 구현이라고 한다. extends대신 implemensts 키워드를 써서 상속한다.
 *      - 클래스가 인터페이스를 상속하는 경우 여러개를 상속할 수 있다.(, 로 구분해서 정의)
 * 5. 하나의 클래스가 클래스와 인터페이스를 모두 상속하는 경우
 *      class A extends Super implements InterA{
 *             --------
 *              implements보다 먼저 정의되어야 한다.
 *      }
 * 
 * 
 */
interface SuperInterfaceA{
    void show(); // public abstract void show()와 동일
}
interface InterA extends SuperInterfaceA{
    void test();
}

interface InterB{
    void change();
}

interface ChildInterface extends InterA, InterB{

}

class MyClass implements InterA, InterB{

    @Override
    public void show(){

    }

    @Override
    public void test(){
        
    }

    @Override
    public void change(){
        
    }
}
interface InterC{}


class MyChild extends MyClass implements InterC{

}

public class Ex01_InterfaceTest01 {
    public static void main(String[] args) {
        MyChild obj = new MyChild();
        // MyChild obj2 = new MyChild();
        test(obj);
        run(obj);
    }
    public static void test(MyClass obj){

    }
    public static void run(InterC obj){

    }
}
