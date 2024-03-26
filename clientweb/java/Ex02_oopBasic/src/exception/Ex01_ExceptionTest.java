package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 프로그램 실행중에 예외가 발생하는 상황
class Super{

}
class Sub extends Super{

}

public class Ex01_ExceptionTest {
    public static void main(String[] args) {
        // 1. 개발자가 실수할 수 있는 부분
        System.out.println("****** 프로그램 시작 ******");
        // System.out.println(10/0);
        // System.out.println(args[0]);    //Index 0 out of bounds for length 0 at exception
        String str = null;
        // str.length();   // NullPointerException
        Super obj = new Super();
        // Sub obj2 = (Sub)obj;     //ClassCastException
        System.out.println("*************************");

        // 2. 외부요인이나 사용자의 실수로 발생할 수 있는 Exception
        Scanner key = new Scanner(System.in);
        System.out.println("값 입력: ");
        int data = key.nextInt();
        System.out.println("사용자가 입력한 값 => " + data);

        // 3. API에서 문법적으로 예외처리를 컴파일타입에 요구하는 경우
        // => 메소드 선언부에 XXXException을 throws하는 것은 이 메소드를 사용하면서 XXXXException이 발생할 수 있다는 의미
        // => Exception에 대한 처리를 RuntimeException의 하위 같은 경우 문법적으로 제약하지 않는다.
        //    그러나 RuntimeException의 하위가 아니라 Exception의 하위 Exception들은 컴파일 시점에 체크하므로
        //    예외처리를 할 수 있도록 문법적으로 제약하므로 반드시 Exception에 대한 처리를 해야한다.
        // => RuntimeException의 하위 이거나 아니거나 예외 발생 가능성이 있는 코드는 무조건 예외를 처리
        try{
            // 예외가 발생할 가능성이 있는 코드를 try블럭 안에 정의
            FileReader fr = new FileReader("test.txt");
            System.out.println((char)fr.read());
            System.out.println(Integer.parseInt("100")+200);
            System.out.println("step1 종료");
        }catch(FileNotFoundException e){
            // 예외가 발생되면 실행될 코드
            System.out.println("파일 경로가 틀림");
            System.out.println("파일을 다시 선택하세요");
        }catch(IOException e){
            System.out.println("파일 액세스 오류 발생");
        }
        System.out.println("프로그램 종료");
    }
}
