package oopbasic;
/**
 * num 인스턴스 변수(객체변수)와 staticNum 클래스 변수가 다르므로 외부에서 접근하는 방법도 다르다.
 * num은 인스턴스 변수이므로 객체참조 변수를 통해서 사용
 * 
 * staticNum은 객체의 소유가 아니라 클래스에 정의된 공유변수이고 메모리 공통으로 사용하는 영역에 할당되므로
 * 어떤 객체의 소유도 아니다.
 * static이 추가된 변수나 메소드는
 * 클래스명.변수
 * 클래스명.메소드()
 */
public class Ex13_StaticDemoTest {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        obj1.display();
        System.out.println("인스턴스변수 => "+obj1.num + ", 클래스 변수=> "+ StaticDemo.staticNum);

        StaticDemo obj2 = new StaticDemo();
        obj2.display();
        System.out.println("인스턴스변수 => "+obj2.num + ", 클래스 변수=> "+ StaticDemo.staticNum);

        StaticDemo obj3 = new StaticDemo();
        obj3.display();
        System.out.println("인스턴스변수 => "+obj3.num + ", 클래스 변수=> "+ StaticDemo.staticNum);

        // API에서 제공되는 static변수도 동일한 방법으로 접근
        System.out.println(Math.random());
        System.out.println(Math.PI);
    }
}
