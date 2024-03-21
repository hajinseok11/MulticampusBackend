package oopInheritance;
/**
 * << 상속관계에서 메소드가 갖는 특징 >>
 * 1. 상위클래스에서 정의된 메소드를 하위클래스에서 호출할 수 있다.
 *    => 하위 클래스 타입의 참조변수를 통해서도 상위클래스의 메소드를 사용할 수 있다.
 * 2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에 정의하면 하위클래스의 메소드가 우선으로 실행된다.
 *    => 상위 클래스에 정의된 메소드의 선언부(리턴타입, 메소드명, 매개변수 갯수, 매개변수 타입)가 하위클래스의 
 *       메소드 선언부와 동일한 경우 이를 메소드의 재정의 즉, 메소드 오버라이딩이라 한다.
 */
class Parent{
    public void display(){
        System.out.println("부모의 display()");
    }
}
class Child extends Parent{
    public void test(){
        System.out.println("자식클래스의 test()");
        display();
        super.display();   
    }
    public void display(){
        System.out.println("하위클래스의의 display()");
    }

}
public class Ex03_InheritanceTest2 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.test(); 
        obj.display();
        
    }
}
