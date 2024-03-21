package oopbasic;

public class Ex15_StaticMethodTest {

    // 자바인터프리터(java.exe)에 의해 호출되는 메소드
    public static void main(String[] args) {
        StaticMethodDemo.print();
        Ex15_StaticMethodTest obj = new Ex15_StaticMethodTest();
        display();  // static에서 static호출
        obj.show(); // static안에서 nonstatic호출
    }
    public static void display(){
        System.out.println("display");
    }
    public void show(){
        System.out.println("show");
    }
}
