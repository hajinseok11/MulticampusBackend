package ooppolymorphism;
/**
 * 추상클래스
 * => 객체를 생성할 수 없는 클래스, 미완성된 클래스
 *    내용이 구현되어 있지 않은 메소드를 포함하고 있는 클래스를 추상클래스라 한다.
 *    ------------------------------
 *    추상메소드(body가 없는 메소드)
 *    1) 추상메소드를 선언하는 방법
 *       접근제어자 abstract 리턴타입 메소드명(매개변수1, 매개변수2...);
 *       왜????
 *    
 *    2) 추상클래스의 특징 
 *      - 추상메소드가 하나라도 정의되어 있으면 추상클래스가 된다. 따라서 추상클래스는 선언분에 abstract라는 키워드를 추가한다.
 *      - 추상클래스에는 추상메소드와 일반메소드를 모두 정의할 수 있다.
 *      - 추상클래스는 객체생성을 할 수 없다.
 *      - 추상클래스를 상속받는 클래스는 extends하면 에러가 발생
 *          => Child클래스가 Parent클래스를 상속받는다.
 *             Parent클래스의 모든 멤버가 Child의 소유가 된다. 
 *             Child는 Parent의 일반메소드인test와 추상메소드인 display를 모두 소유하므로 Child도 추상클래스가 된다.
 *             
 * [에러처리]
 *             - Child클래스의 선언부에 abstract
 *             - Child가 상속받은 추상메소드를 구현(오버라이딩)
 * 
 * 
 *      - abstract메소드는 하위클래스에서 반드시 오버라이딩 되어야 한다는 것을 문법적으로 제시
 */            
abstract class Parent{
    public void test(){
        System.out.println("일반메소드");
    }
    public abstract void display(String data);
}
class Child extends Parent{
    // 컴파일러에 정보를 알려주는 작업
    // @Override는 컴파일러에게 오버라이딩된 메소드라는 것을 알려주는 기호
    public void display(String data) {
        System.out.println("부모에게 상속받은 추상메소드를 구현");
        
    }
    // public void display(String data){
    //     System.out.println("부모에게 상속받은 추상메소드를 구현");
    // }

}
public class Ex01_AbstractTest {
    public static void main(String[] args) {
        // Parent obj = new Parent();
        Child obj = new Child();
        obj.display("");
    }
}
