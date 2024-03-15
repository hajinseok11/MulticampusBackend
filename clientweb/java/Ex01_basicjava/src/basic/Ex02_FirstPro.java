package basic;
// main메소드는 자바 application에서 시작점
// => 인터프리터가 호출하는 메소드
public class Ex02_FirstPro {
    public static void main(String[] args) {
        System.out.println("first");
        // 데이터타입 변수명;
        // 데이터타입 변수명 = 초기값;
        int num = 100;
        // int num = 200; 자바는 타입에 맞게 값을 할당해야 한다.
        num = 200; // 변수의 값을 변경할 수 있다.
        System.out.println(num);
        int num1 = 100;
        int num2 = 200;
        int result = num1 + num2;
        System.out.println("더한결과 => "+result);
        // println 줄바꿈, print 줄바꿈 x
        System.out.print("값1");
        System.out.print("값2");
        // +, /, *, -, %
        
    }
}
