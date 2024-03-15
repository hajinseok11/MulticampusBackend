package basic;

import java.util.Scanner;

// 기본형 변수의 데이터 표현과 리터럴
public class Ex05_PrimitiveTypeValueTest {
    public static void main(String[] args) {
        // java.lang패키지 이외의 패키지에 있는 클래스를 사용하려면 import를 해야한다.
        // Scanner scan = new Scanner(System.in);
        // int inputval = scan.nextInt(); // 키보드로 입력하는 숫자가 정수 형태로 변수에 저장
        // System.out.println(inputval);

        int num = 100; // 변수 - 변하는 값을 메모리에 저장
        num = 200;
        // final이 추가된 변수는 상수
        // 상수는 정해진 값이 저장된 변수로 값을 다시 변경할 수 없다.
        // 상수명은 대문자로 정의
        final int NUM_VALUE = 1000;
        // NUM_VALUE = 2000;

        // 논리형 - boolean
        boolean boolVal = true; // false
        System.out.println("boolVal => " + boolVal);

        // 정수형
        // 정수형 리터럴의 기본타입은 int
        // byte b = 128;
        //     ---  ----
        //    변수  리터럴
        //    byte   int
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 2147483648L; // int형 리터럴로 long형의 데이터를 표현할 수 없으므로 접미사를 L이나 l을 추가
        System.out.println("b=>" + b);

        // 실수형
        // 실수형 리터럴의 기본타입은 double
        //float f = 10.5
        //     ---  ----
        //     변수  리터럴
        //    float  double
        float f = 10.5f; //F와 같은 접미사를 추가
        double d = 10.5;
        System.out.println("f => " + f);
        System.out.println("d => " + d);

        // 문자형
        // char의 리터럴은 작은 따옴표로 표현
        char c = 'A';
        c = '한';
        System.out.println("c=>" + c);

        // 문자열형 - String
        // String 기본형이 아니라 참조형 타입이지만 많이 사용되므로 리터럴로 표현이 가능
        // String의 리터럴은 " " 큰 따옴표
        String str = "참조형인  String을 기본형처럼 표현하는 경우 리터럴은 큰따옴표로 추가해서 구성";
        System.out.println("String=> "+str);
        // int/int는 int 연산
        System.out.println(10/3);

        // 연산에 double이 포함되면 double로 변경해서 연산
        double val = 3;
        System.out.println(10/val);
        System.out.println(3/10);
        System.out.println(3/10.0);
        System.out.println(3/(double)10); //10이라는 int형 리터럴의 타입을 double로 형변환

        // 특수문자
        System.out.println("안녕 자바\t프로그래밍");
        System.out.println("안녕 자바\n프로그래밍");
        System.out.println("안녕 \"자바\"프로그래밍");

        char data = 97;
        System.out.println(data); // a 출력됨
    }
}
