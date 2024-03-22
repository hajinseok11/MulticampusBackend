package ooppolymorphism;
// 객체의 형변환
// 사용자 정의 클래스
class Super{
    String data = "상위 클래스";
    public void display(){
        System.out.println("super의 display");
    }
}
class Sub extends Super{
    String data = "하위 클래스";
    public void display(){
        System.out.println("sub의 display");
    }
    public void test(){
        System.out.println("sub의 test");
    }
}
public class Ex03_RefTypeCastingTest2 {
    public static void main(String[] args) {
        System.out.println("1. Super 타입의 참조변수로 Super객체를 사용");
        Super obj1 = new Super();
        obj1.display();
        System.out.println(obj1.data);
        System.out.println("************************************************");
        
        System.out.println("2. Sub타입의 참조변수로 Sub객체를 사용");
        Sub obj2 = new Sub();
        obj2.display();
        System.out.println(obj2.data);
        System.out.println("************************************************");
        // 상속관계에 있는 클래스는 자동캐스팅
        // 서브클래스의 인스턴스를 슈퍼클래스 타입으로 변환하는 작업 - 업케스팅 (안전)
        // 컴파일 시점에는 참조변수의 타입에 따라서 사용가능한 멤버가 결정된다.
        // 자바는 동적 바인딩
        // 동적바인딩은 런타임시에 실제생성되는 객체를 확인하고 메소드의 실행도 실제 생성되는 객체의 메소드가 실행
        // 필드는 참조변수의 선언된 타입으로 호출되고 메소드는 런타임시에 실제 할당된 객체의 메소드가 호출
        System.out.println("3. Super 타입의 참조변수로 Sub객체를 사용");
        Super obj3 = new Sub();
        obj3.display();
        // obj3.test();
        // obj3이 Super타입의 참조변수이지만 실제 참조하고있는 생성된 객체는 Sub객체이므로 캐스팅이 가능
        // 부모타입인 obj3의 객체참조를 서브객체 참조로 변환 => 다운캐스팅
        ((Sub)obj3).test();
        System.out.println(obj3.data);
        System.out.println("************************************************");

        System.out.println("4. Super 타입의 참조변수로 Super 객체를 사용");
        // Sub obj4 = new Super(); ---------------------------- x

        System.out.println("************************************************");
        // 명시적으로 캐스팅하면 컴파일러 속일 수 있다.
        // obj1이 참조하는 객체가 Super이므로 실행할 때 캐스팅을 할 수 없어 오류가 발생한다.
        System.out.println("5. Sub변수 = Super객체를 참조하는 변수");
        // Sub obj5 = (Sub)obj1; ---------------------------- x

        System.out.println("************************************************");
        System.out.println("6. Sub변수 = Sub객체를 참조하는 Super변수");
        Sub obj6 = (Sub)obj3;
        obj6.display();
        System.out.println(obj6.data);


    }
}
