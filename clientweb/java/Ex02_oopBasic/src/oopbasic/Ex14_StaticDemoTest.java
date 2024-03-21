package oopbasic;

public class Ex14_StaticDemoTest {
    public static void main(String[] args) {
        // printSize나 print메소드는 static메소드이므로 클래스이름.메소드로 엑세스
        StaticMethodDemo.printSize("test");
        StaticMethodDemo.print();

        StaticMethodDemo.printSize("test~~~~~~");
        StaticMethodDemo.print();

    //     non-static 메소드는 new로 객체를 생성해서 참조변수.메소드로 엑세스
    //     StaticMethodDemo obj = new StaticMethodDemo();
    //     obj.show();
    //     StaticMethodDemo.change();
    }
}
